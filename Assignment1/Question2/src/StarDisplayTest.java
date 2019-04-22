import java.util.*;
public class StarDisplayTest{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		StarDisplay s = new StarDisplay();
		
		System.out.println("Enter a 5 digit intieger:");
		a  = sc.nextInt();
		
		s.displayStar(a);
	}
}