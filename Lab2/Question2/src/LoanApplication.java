import java.util.*;

public class LoanApplication {
	public static void main(String args[]) {
		LoanCalculator c = new LoanCalculator();
		Scanner sc = new Scanner(System.in);
		
		GregorianCalendar today;
		today = new GregorianCalendar();
		
		double p;
		double i;
		int t;
		double a;
		
		System.out.println("Welcome to the Purdue University Northwest Loan Calculator\n"
				+ "Today is: "+today.getTime()
				+ "\n=======================================\n");
		System.out.println("Enter the principle amount for the loan: ");
		p = sc.nextDouble();
		System.out.println("Enter the interest rate of the loan: ");
		i = sc.nextDouble();
		System.out.println("Enter the term (in months) of the loan: ");
		t = sc.nextInt();
		a = c.MonthlyPayment(p, i, t);
		System.out.println("\nThe monthly payment will be: $" + String.format("%.2f", a) + "\n");
		System.out.println("The loan is $" + String.format("%.2f", p) + " at an interest rate of " + String.format("%.2f", i) + "%\n");
		c.DisplaySchedule(p, i, t);
	}
}