public class Student extends Person implements Comparable<Student>{
	String myFirstName;
	String myLastName;
	String myEmailAddress;
	double myGPA;
	int myStudentID;
	static int lastIDAssigned = 1000;
	
	public Student(String aFirstName, String aLastName) {
		super(aFirstName, aLastName);
		myFirstName = super.getFirstName();
		myLastName = super.getLastName();
		myEmailAddress = super.getEmailAddress();
		myGPA = 0;
		lastIDAssigned++;
		myStudentID = lastIDAssigned;
	}
	
	public String getMyFirstName() { return myFirstName; }
	public String getMyLastName() { return myLastName; }
	public String getFullName() { return myFirstName + " " + myLastName; }
	public String getMyEmailAddress() { return myEmailAddress; }
	public double getMyGPA() { return myGPA; }
	public int getMyStudentID() { return myStudentID; }
	
	public void setMyFirstName(String aFirstName) { myFirstName = aFirstName; }
	public void setMyLastName(String aLastName) { myLastName = aLastName; }
	public void setMyEmailAddress(String aEmailAddress) { myEmailAddress = aEmailAddress; }
	public void setMyGPA(double aGPA) { myGPA = aGPA; }
	public void setMyStudentID(int aStudentID) { myStudentID = aStudentID; }
	
	public String superToString() {
		return super.toString();
	}
	
	public String toString() {
		return super.toString() + ", has GPA: " + myGPA + ", and has Student ID: " + myStudentID;
	}
	
	public int compareTo(Student s) {
		if (this.getMyGPA() >= s.getMyGPA()) {
			System.out.println(this.getFullName() + " has an equal or higher GPA.");
			return 1;
		}
		else {
			System.out.println(s.getFullName() + " has a higher GPA.");
			return 0;
		}
	}
}