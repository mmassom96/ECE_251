import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTestProgram2 {
	public static void main(String args[]) {
		ArrayList<Integer> numbersArrayList = new ArrayList<Integer>(java.util.Arrays.asList(1, 45, 23, 87, 89, 213, 54, 11, 76, 98, 23, 5));
		Iterator numsIterator = numbersArrayList.iterator();
		
		System.out.println("The ArrayList looks like this beforehand: " + numbersArrayList);
		
		while (numsIterator.hasNext()) {
			Integer n = (Integer)numsIterator.next();
			if (n % 2 != 0) { 
				numsIterator.remove();
			}
		}
		
		System.out.println("The ArrayList looks like this afterwards: " + numbersArrayList);
	}
}