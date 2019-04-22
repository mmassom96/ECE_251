import java.util.ArrayList;
import java.util.Iterator;

public class Store {
	private String      		 name;
    private ArrayList<Customer>  customers;

    public Store(String n) {
       name = n;
       customers = new ArrayList<Customer>();
    }

    public String getName() { return name; }
    public ArrayList<Customer> getCustomers() { return customers; }

    public void addCustomer(Customer c) {
    	customers.add(c);
    }
    //record the purchase from a customer, and add the customer in the store record.
	public void recordPurchase(Customer c, float price) {

    }

    // List the customers
    public void listCustomers() {
    	for (Customer c: customers)
    		System.out.println(c);
    }

    // Returns a new arraylist of all customers of the store that have the
    // same sex as the one specified in the parameter.
	public ArrayList<Customer> getCustomersOfSex(char sex) {

	}

    // Remove all customers from the store that are broke (i.e., have < $10)
	public void removeBrokeCustomers() {

	}


    // Return all customers in the store that have the same sex and are within the
    // same age group (i.e., +- 3 years of age) as the one specified.
	public ArrayList<Customer> friendsFor(Customer match) {

	}

	public void saveTo(java.io.PrintWriter aFile) throws java.io.IOException {
		Iterator it = customers.iterator();
		while(it.hasNext()) {
			Customer c = (Customer)it.next();
			c.saveTo(aFile);
		}
	}

	public static Store readFrom(java.io.BufferedReader aFile) throws java.io.IOException {
		Store s = new Store("?");
		while (aFile.ready()) {
			Customer c = new Customer();
			c = c.readFrom(aFile);
			s.addCustomer(c);
		}
		return s;
	}
}