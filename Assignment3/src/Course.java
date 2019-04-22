import java.util.ArrayList;
import java.util.Iterator;


public class Course {
	private String title;
	private String code;
	private int number;
	
	public Course() {
		title = "Introduction to Electrical Engineering";
		code = "ECE";
		number = 10100;
	}
	
	public Course(String aCode, int aNumber, String aTitle) {
		title = aTitle;
		code = aCode;
		number = aNumber;
	}
	
	public String getTitle() { return title; }
	public String getCode() { return code; }
	public int getNumber() { return number; }
	
	public void setTitle(String sTitle) { title = sTitle; }
	public void setCode(String sCode) { code = sCode; }
	public void setNumber(int sNumber) { number = sNumber; }
	
	public String toString() {
		return code + number + " - " + title;
	}
	
	ArrayList<Student> studentsEnrolled = new ArrayList<Student>();
	
	public void getStudents() {
		Iterator it = studentsEnrolled.iterator();
		System.out.println("Students enrolled in " + code + number + ":");
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println("\t" + s.toString());
		}
		System.out.print("\n");
	}
	
	public void addStudent(Student s) { studentsEnrolled.add(s); }
	
	public void removeStudent(Student s) { studentsEnrolled.remove(s); }
	
	public ArrayList<Student> getEnrollment() { return studentsEnrolled; }
}