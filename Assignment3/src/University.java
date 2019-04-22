import java.util.ArrayList;
import java.util.Iterator;

public class University {
	private String name;
	private ArrayList<Course> coursesOffered = new ArrayList<Course>();
	private ArrayList<Student> studentEnrollment = new ArrayList<Student>();
	
	public University (String aName) {
		name = aName;
	}
	
	public String getName() { return name; }
	public ArrayList<Course> getCoursesOffered() { return coursesOffered; }
	public ArrayList<Student> getStudentEnrollment() { return studentEnrollment; }
	
	public void offerCourse(Course c) {
		coursesOffered.add(c);
	}
	
	public void cancelCourse(Course c) {
		if(c.getEnrollment().size() == 0)
			coursesOffered.remove(c);
		else
			System.out.println("Cannot cancel course: students enrolled in " + c.getTitle());
	}
	
	public void enrollStudentInCourse(Student s, Course c) {
		if (!s.getStudentCourses().contains(c))
			s.addCourse(c);
		if (!c.getEnrollment().contains(s))
			c.addStudent(s);
		if (!studentEnrollment.contains(s))
			studentEnrollment.add(s);
	}
	
	public void withdrawStudentFromCourse(Student s, Course c) {
		s.removeCourse(c);
	}
	
	public String toString() {
		return name + ": " + coursesOffered.size() + " Courses, " + studentEnrollment.size() + " Students";
	}
	
	public ArrayList<Course> lowRegistrationCourses(int min) {
		ArrayList<Course> lowRegistration = new ArrayList<Course>();
		Iterator it = coursesOffered.iterator();
		while(it.hasNext()) {
			Course c = (Course)it.next();
			if (c.getEnrollment().size() <= min) { lowRegistration.add(c); }
		}
		return lowRegistration;
	}
	
	public Course highestEnrollment() {
		Course largest;
		if (coursesOffered.size() == 0)
			return null;
		else {
		largest = coursesOffered.get(0);
		for(int i = 0; i < coursesOffered.size(); i++) {
			if (coursesOffered.get(i).getEnrollment().size() > largest.getEnrollment().size()) { largest = coursesOffered.get(i); }
		}
		return largest;
	}
}
	
	public Student busiestStudent() {
		Student busiest;
		if (studentEnrollment.size() == 0)
			return null;
		else {
		busiest = studentEnrollment.get(0);
		for(int i = 0; i < studentEnrollment.size(); i++) {
			if (studentEnrollment.get(i).getStudentCourses().size() > busiest.getStudentCourses().size()) { busiest = studentEnrollment.get(i); }
		}
		return busiest;
	}
}
	
	
}