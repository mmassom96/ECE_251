public class UnderstandingIFProgram{
	private char input;
	private boolean male;
	
	public void question() {
		System.out.print("Are you (M)ale or (F)emale? ... ");
		input = new java.util.Scanner(System.in).nextLine().charAt(0);
		
		male = ((input == 'M') || (input == 'm'));
		//This is more efficiant because it defines what "male" is rather than checking if and input is equal to what "male" is.
		
		if (!male)
			System.out.println("OK, now I know that you are a female.");
		//This is more efficient becase Male == false and NOT Male are the same thing.
		
		else
			System.out.println("OK, now I know that you are a male.");
	}
}