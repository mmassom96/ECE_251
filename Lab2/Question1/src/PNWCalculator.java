import java.util.*;

public class PNWCalculator {
	public void calculate() {
		Scanner sc = new Scanner(System.in);
		int optype;
		double op1;
		double op2;
		double ans;
		Display.opening();
		optype = sc.nextInt();
		while (optype != 5) {
			if (optype == 1) {
				op1 = Display.op1();
				op2 = Display.op2();
				ans = Calc.Add(op1, op2);
				Display.result(ans);
			}
			else if (optype == 2) {
				op1 = Display.op1();
				op2 = Display.op2();
				ans = Calc.Sub(op1, op2);
				Display.result(ans);
			}
			else if (optype == 3) {
				op1 = Display.op1();
				op2 = Display.op2();
				ans = Calc.Mult(op1, op2);
				Display.result(ans);
			}
			else if (optype == 4) {
				op1 = Display.op1();
				op2 = Display.op2();
				ans = Calc.Div(op1, op2);
				Display.result(ans);
			}
			else {
				System.out.println("Error: Invalid operation type. Please try again.");
			}
			Display.closing();
			Display.opening();
			optype = sc.nextInt();
		}
		System.out.println("Goodbye.");
	}
}
