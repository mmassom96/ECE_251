public class Test {
	public static void main(String args[]) {
		Person p1 = new Person("Jane", "Smith");
		Person p2 = new Person("John", "Morris");
		Person p3 = new Person("Mary", "Key");
		
		Student s1 = new Student("Matt", "Massom");
			s1.setMyGPA(3.2);
		Student s2 = new Student("Will", "Jones");
			s2.setMyGPA(3.0);
		Student s3 = new Student("Sarah", "Miller");
			s3.setMyGPA(3.2);
		
		System.out.println("Here is a list of all people:");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(s1.superToString());
		System.out.println(s2.superToString());
		System.out.println(s3.superToString());
		
		System.out.println("\nHere is a list of all students:");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println("\nHere is a comparison of the students:");
		System.out.println(s1.getFullName() + " vs " + s2.getFullName());
		s1.compareTo(s2);
		System.out.println(s2.getFullName() + " vs " + s3.getFullName());
		s2.compareTo(s3);
		System.out.println(s3.getFullName() + " vs " + s1.getFullName());
		s3.compareTo(s3);
	}
}