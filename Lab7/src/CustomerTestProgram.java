import java.io.*;

public class CustomerTestProgram {
	public static void main(String args[]) {
		Customer c1 = new Customer("Amie", 14, 'F', 100);
		Customer c2 = new Customer("Brad", 15, 'M', 0);

		try {
			DataOutputStream out;
			out = new DataOutputStream(new FileOutputStream("customers.txt"));
			c1.saveTo(out);
			c2.saveTo(out);
			out.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		
		try {
			DataInputStream in;
			in = new DataInputStream(new FileInputStream("customers.txt"));
			System.out.println(Customer.readFrom(in));
			System.out.println(Customer.readFrom(in));
			in.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
}