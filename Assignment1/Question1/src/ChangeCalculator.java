import java.util.*;

public class ChangeCalculator{
	public static void main(String args[]) {
		calc();
	}
	public static void calc() {
		Scanner sc = new Scanner(System.in);
		
		double dtotal;
		int total;
		int change;
		int dollars;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		System.out.println("Enter the cost of the candies (in cents): ");
		total = sc.nextInt();
		dtotal = total / 100.0;
		
		change = 500 - total;
		dollars = change / 100;
		quarters = (change % 100) / 25;
		dimes = ((change % 100) % 25) / 10;
		nickels = (((change % 100) % 25) % 10) / 5;
		pennies = (((change % 100) % 25) % 10) % 5;
		
		System.out.println("The change from $5.00 for $" + dtotal + " of candies is:\n"
				+ dollars + " dollar(s)\n"
				+ quarters + " quarter(s)\n"
				+ dimes + " dime(s)\n"
				+ nickels + " nickel(s)\n"
				+ pennies + " pennie(s)");
		
	}
}