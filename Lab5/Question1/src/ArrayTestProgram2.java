public class ArrayTestProgram2 {
	public static void main(String args[]) {
		int			count = 0;
		boolean[]	values = {true, false, false, true, true, true, false};
	
		int i;
		for (i = 0; i < 7; i++) {
			if (values[i] == true)
				count++;
			else if (values[i] == false)
				count--;
		}
		
		if (count > 0)
			System.out.println("true");
		else if (count < 0)
			System.out.println("false");
		else
			System.out.println("There is an even number of 'true' and 'false' values.");
	}
}