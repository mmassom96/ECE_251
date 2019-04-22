public class RealEstateAgency{
	public static void main(String args[]) {
		Buyer b1 = new Buyer("Matt", "123 Main St, Hammond, IN", "219-555-0123", 0001);
		Buyer b2 = new Buyer("Madison", "75 Indianapolis Blvd, Hammond, IN", "219-555-1234", 0002);
		Buyer b3 = new Buyer();
		
		Home h1 = new Home("Hammond", " 2 bedroom condo", "100 Kennedy Ave, Hammond, IN", 2002, 0, 0004, 115000);
		Home h2 = new Home("Highland", "3 bedroom house", "500 Indianapolis Blvd, Highland, IN", 1995, 0, 0005, 225000);
		Home h3 = new Home("Hammond", "2 bedroom house", "404 169th St, Hammond, IN", 1982, 0, 0006, 175000);
		
		RealEstateAgent r1 = new RealEstateAgent("Bill", "1000", 0.015);
		RealEstateAgent r2 = new RealEstateAgent("Jane", "1001", 0.02);
		
		b1.viewHome(h1);
		b1.viewHome(h3);
		b2.viewHome(h2);
		b2.viewHome(h3);
		b3.viewHome(h1);
		
		System.out.println(r2.sellHome(h1, b3) + ", $" + r2.getTotalCommissionEarned() + "\n");
		System.out.println(r1.sellHome(h2, b2) + ", $" + r2.getTotalCommissionEarned() + "\n");
		System.out.println(r2.sellHome(h3, b1) + ", $" + r2.getTotalCommissionEarned());
		
	}			
}
