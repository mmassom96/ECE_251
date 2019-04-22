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
		float newMoney = c.getMoney() - price;
		c.setMoney(newMoney);
		addCustomer(c);
    }

    // List the customers
    public void listCustomers() {
    	for (Customer c: customers)
    		System.out.println(c);
    }

    // Returns a new arraylist of all customers of the store that have the
    // same sex as the one specified in the parameter.
	public ArrayList<Customer> getCustomersOfSex(char sex) {
		ArrayList<Customer> sameSex = new ArrayList<Customer>();
		Iterator cIterator = customers.iterator();
		while(cIterator.hasNext()) {
			Customer c=(Customer)cIterator.next();
			if (c.getSex() == sex) {
				sameSex.add(c);
			}
		}
		return sameSex;
	}

    // Remove all customers from the store that are broke (i.e., have < $10)
	public void removeBrokeCustomers() {
		Iterator cIterator = customers.iterator();
		while(cIterator.hasNext()) {
			Customer c = (Customer)cIterator.next();
			if (c.getMoney() < 10) {
				cIterator.remove();
			}
		}
	}


    // Return all customers in the store that have the same sex and are within the
    // same age group (i.e., +- 3 years of age) as the one specified.
	public ArrayList<Customer> friendsFor(Customer match) {
		ArrayList<Customer> friends = new ArrayList<Customer>();
		Iterator cIterator = customers.iterator();
		while(cIterator.hasNext()) {
			Customer c = (Customer)cIterator.next();
			if ((c.getAge() - match.getAge() <= 3) && (c.getAge() - match.getAge() >= -3)) {
				if((c.getSex() == match.getSex()) && (c.getName() != match.getName())) {
					friends.add(c);
				}
			}
		}
		return friends;
	}


}