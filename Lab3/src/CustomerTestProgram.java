public class CustomerTestProgram {
	public static void main(String args[]) {
		Customer c1 = new Customer();
		c1.name = "Bob";
		c1.age = 17;
		c1.money = 10;
		
		Customer c2 = new Customer();
		c2.name = "Dottie";
		c2.age = 3;
		c2.money = 0;
		
		Customer c3 = new Customer();
		c3.name = "Steve";
		c3.age = 67;
		c3.money = 30;
		
		Customer c4 = new Customer();
		c4.name = "Jane";
		c4.age = 64;
		c4.money = 0;
		
		System.out.println("Here is the situation before going into the circus:");
		System.out.println("   Bob has $" + c1.money);
		System.out.println("   Dottie has $" + c2.money);
		System.out.println("   Steve has $" + c3.money);
		System.out.println("   Jane has $" + c4.money);
		
		c1.admitted = c1.payAdmission();
		c2.admitted = c2.payAdmission();
		c3.admitted = c3.payAdmission();
		c4.admitted = c4.payAdmission();
		
		System.out.println(c1.admitted);
		System.out.println(c2.admitted);
		System.out.println(c3.admitted);
		System.out.println(c4.admitted);
		
		c3.give(c4,  15);
		c4.admitted = c4.payAdmission();
		
		System.out.println(c1.admitted);
		System.out.println(c2.admitted);
		System.out.println(c3.admitted);
		System.out.println(c4.admitted);
		
		System.out.println("Here is the situation after going into the circus:");
		System.out.println("   Bob has $" + c1.money + ",\tAdmitted: " + c1.admitted);
		System.out.println("   Dottie has $" + c2.money + ",\tAdmitted: " + c2.admitted);
		System.out.println("   Steve has $" + c3.money + ",\tAdmitted: " + c3.admitted);
		System.out.println("   Jane has $" + c4.money + ",\tAdmitted: " + c4.admitted);
		
/*		System.out.println("The fee for Bob is $" + c1.computeFee());
		System.out.println("The fee for Dottie is $" + c2.computeFee());
		System.out.println("The fee for Steve is $" + c3.computeFee());
		System.out.println("The fee for Jane is $" + c4.computeFee());
*/
		
/*		System.out.println("Before giving ...");
		System.out.println("c1 has $" + c1.money);
		System.out.println("c2 has $" + c2.money);
		c1.give(c2, 23.75f);
		System.out.println("After giving ...");
		System.out.println("c1 has $" + c1.money);
		System.out.println("c2 has $" + c2.money);
*/
		
/*		System.out.println(c1.money);
		c1.spend(10);
		c1.spend(4.75f);
		c1.spend(15.25f);
		c1.spend(100);
		System.out.println(c1.money);
*/
	}
}