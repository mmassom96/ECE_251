public class StarDisplay {
	public void displayStar(int a) {
		int x;
		int y;
		y = a;
		
		int i;
		i = 10000;
		
		while (i > 0) {
			x = y / i;
			
			if (x == 0)
				Display.zero();
			else if (x == 1)
				Display.one();
			else if (x == 2)
				Display.two();
			else if (x == 3)
				Display.three();
			else if (x == 4)
				Display.four();
			else if (x == 5)
				Display.five();
			else if (x == 6)
				Display.six();
			else if (x == 7)
				Display.seven();
			else if (x == 8)
				Display.eight();
			else if (x == 9)
				Display.nine();
			else
				System.out.println("Error: number too large.");
			
			y = y % i;
			
			i = i / 10;
		}
	}
}