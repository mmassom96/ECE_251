import java.lang.Math;

public class LoanCalculator {
	public double MonthlyPayment(double principle, double interestRate, int term) {
		double payment;
		double newInterest;
		newInterest = interestRate/100/12;
		payment = principle * newInterest * Math.pow((newInterest + 1), term) / (Math.pow((newInterest + 1), term) - 1);
		return payment;
	}
	public void DisplaySchedule(double principle, double interestRate, int term) {
		
		double payment;
		payment = MonthlyPayment(principle, interestRate, term);
		
		double remaining;
		remaining = principle;
		
		int month;
		month = 0;

		System.out.println("Month\tPayment\tAmount remaining");
		
		while (remaining > 0) {
			month++;
			
			remaining = remaining - payment;
			
			if (remaining > 0) {
				System.out.println(month +"\t$"+ String.format("%.2f", payment) +"\t$"+ String.format("%.2f", remaining));
			}
			else {
				System.out.println(month +"\t$"+ String.format("%.2f", payment) +"\t$0.00");
			}
		}
		System.out.println("\nThe total amount paid was $"+ String.format("%.2f", month*payment));
	}
}