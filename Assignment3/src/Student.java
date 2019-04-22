import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	private String name;
	private int year;
	private int studentNumber;
	
	public Student(String aName, int aStudentNumber, int aYear) {
		name = aName;
		year = aYear;
		studentNumber = aStudentNumber;
	}
	
	public String getName() { return name;	}
	public int getYear() { return year; }
	public int getStudentNumber() { return studentNumber; }
	
	public void setName(String sName) { name = sName; }
	public void setYear(int sYear) { year = sYear; }
	public void setStudentNumber(int sStudentNumber) { studentNumber = sStudentNumber; }
	
	public String toString() {
		return name + " #" + studentNumber + " (" + year + ")"; 
	}
	
	ArrayList<Course> studentCourses = new ArrayList<Course>();
	
	public void getCourses() {
		Iterator it = studentCourses.iterator();
		System.out.println(name + " is enrolled in:");
		while(it.hasNext()) {
			Course c = (Course)it.next();
			System.out.println("\t" + c.toString());
		}
		System.out.print("\n");
	}
	
	public void addCourse(Course c) { studentCourses.add(c); }
	
	public void removeCourse(Course c) { studentCourses.remove(c); }
	
	public ArrayList<Course> getStudentCourses() { return studentCourses; }
	
	public ArrayList<Student> classmatesAt(University u) {
		ArrayList<Student> classmates = new ArrayList<Student>();
		ArrayList<Course> potentialMatch = new ArrayList<Course>();
		Iterator it = u.getStudentEnrollment().iterator();
		while(it.hasNext()) {
			Student s = (Student)it.next();
			potentialMatch = s.getStudentCourses();
			for(int i = 0; i < s.getStudentCourses().size(); i++) {
				for(int j = 0; j < studentCourses.size(); j++) {
					if(potentialMatch.get(i) == studentCourses.get(j)) {
						classmates.add(s);
						j = studentCourses.size() + 1;
						i = s.getStudentCourses().size() + 1;
					}
				}
			}
		}
		return classmates;
	}
}
