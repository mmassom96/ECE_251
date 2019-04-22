import java.util.*;

public class Display{
	double op;
	public static void opening() {
		System.out.println("============================================================\n"
				+ "Welcome to Purdue University Northwest's calculator!\n"
				+ "\n"
				+ "1 - Addition\n"
				+ "2 - Subtraction\n"
				+ "3 - Multiplication\n"
				+ "4 - Divistion\n"
				+ "5 - Exit\n"
				+ "\n"
				+ "Which operation do you want to perform: ");
	}
	public static double op1() {
		Scanner sc = new Scanner(System.in);
		double op;
		System.out.println("What is your first operand: ");
		op = sc.nextDouble();
		return op;
	}
	public static double op2() {
		Scanner sc = new Scanner(System.in);
		double op;
		System.out.println("What is your second operand: ");
		op = sc.nextDouble();
		return op;
	}
	public static void result(double a) {
		System.out.println("The result is: "+String.format("%.4f", a)+"\n");
	}
	public static void closing() {
		System.out.println("Thanks for using Purdue University Northwest's calculator!\n"
				+ "============================================================\n");
	}
}