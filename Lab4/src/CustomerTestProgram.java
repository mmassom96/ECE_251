public class CustomerTestProgram {
	public static void main(String args[]) {
		Customer c = new Customer();
		c.setName("Steve");
		c.setMoney(20);
		c.setAdmitted(true);
		
		System.out.println(c.getName());
		System.out.println(c.getMoney());
		System.out.println(c.getAdmitted());

/*		Customer c1 = new Customer("Bob", 17, 'M');
		Customer c2 = new Customer("Dottie", 3, 'F', 10, true);
		Customer c3 = new Customer("Jane");
		Customer c4 = new Customer();
		
		System.out.println("Bob looks like this:		" + c1);
		System.out.println("Dottie looks like this:		" + c2);
		System.out.println("Jane looks like this:		" + c3);
		System.out.println("Customer 4 looks like this:	" + c4);
*/
	}
}