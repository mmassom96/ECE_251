public class StudentCourseTestProgram2 {
public static void main(String args[]) {
 Student s1 = new Student("Jackie Chen", 100123456, 2015);
 Student s2 = new Student("Bruce Willis", 100234567, 2017);
 Student s3 = new Student("Keanu Reeves", 100345678, 2017);
 Course c1 = new Course("BIOL", 10100, "Introductory Biology I");
 Course c2 = new Course("BIOL", 21300,"Human Anatomy and Physiology I");
 Course c3 = new Course("BIOL", 22100, "Intro To Microbiology");
 s1.addCourse(c1);
 s1.addCourse(c2);
 s2.addCourse(c2);
 c1.addStudent(s1);
 c2.addStudent(s1);
 c2.addStudent(s2);
s1.getCourses(); // should show 2 courses
s2.getCourses(); // should show 1 course
s3.getCourses(); // should show 0 courses
c1.getStudents(); // should show 1 student
c2.getStudents(); // should show 2 students
c3.getStudents(); // should show 0 students
}
}