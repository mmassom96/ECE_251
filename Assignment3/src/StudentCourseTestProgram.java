public class StudentCourseTestProgram {
public static void main(String args[]) {
 Student s1 = new Student("Jackie Chen", 100123456, 2015);
 Student s2 = new Student("Bruce Willis", 100234567, 2017);
 Student s3 = new Student("Keanu Reeves", 100345678, 2017);
 Student s4 = new Student("Carrie Anne Moss", 100456789, 2015);
 Student s5 = new Student("Leonardo Dicaprio", 100567890, 2016);
 Student s6 = new Student("Cate Blanchett", 100678901, 2017);
 Student s7 = new Student("Clint Eastwood", 100789012, 2016);
 Student s8 = new Student("Hilary Swank", 100890123, 2017);
 Student s9 = new Student("Matt Damon", 100901234, 2011);
 Student s10 = new Student("Jack Nicholson", 100000001, 2017);
 Course c1 = new Course("BIOL", 10100, "Introductory Biology I");
 Course c2 = new Course("BIOL", 21300," Human Anatomy and Physiology I");
 Course c3 = new Course("BIOL", 22100, " Intro To Microbiology");
 Course c4 = new Course("BIOL", 30700, "Plant Physiology");
 Course c5 = new Course("ECE",15200, "Programming for Engineers");
 Course c6 = new Course("ECE", 20100, "Linear Circuit Analysis I");
 Course c7 = new Course("ECE", 25100, "Object-Oriented Programming");
 Course c8 = new Course("ECE", 23300, "Micro Computers in Engineering");
 Course c9 = new Course("ECE", 30200, "Probabilistic Methods in Electrical Engineering");
 Course c10 = new Course("ECE", 38400, "Linear Control Systems");
 Course c11 = new Course("MGMT", 1001, "Principles of Financial Accounting");
 Course c12 = new Course("MGMT", 50300, "Advanced Accounting");
 Course c13 = new Course("MGMT", 54400, "Database Management Systems");
 Course c14 = new Course("MGMT", 59000, "Directed Readings in Management");
 Course c15 = new Course("CHM", 10000, "Preparation for General Chemistry");
 Course c16 = new Course("CHM", 11500, "General Chemistry");
 Course c17 = new Course("CHM", 25600, "Organic Chemistry I");
 Course c18 = new Course("CHM", 49000, "Selected Topics in Chemistry for Division Students");
 Course c19 = new Course("PSY", 12000, "Elementary Psychology");
 Course c20 = new Course("PSY", 20300, "Introduction to Research Methods in Psychology");
 Course c21 = new Course("PSY", 20500, "Testing and Measurement");
 Course c22 = new Course("PSY", 31000, "Sensory and Perceptual Processes");
 Course c23 = new Course("PSY", 31100, "Human Learning and Memory");
 Course c24 = new Course("PSY", 31400, "Introduction to Learning");
 Course c25 = new Course("PSY", 33900, "Advanced Social Psychology");
 Course c26 = new Course("PSY", 34400, "Human Sexuality");
 Course c27 = new Course("YUMMY", 1101, "Professional Sandwich Making");
 University cu = new University("Purdue University Northwest");
 cu.offerCourse(c1);
 cu.offerCourse(c2);
 cu.offerCourse(c3);
 cu.offerCourse(c4);
 cu.offerCourse(c5);
 cu.offerCourse(c6);
 cu.offerCourse(c7);
 cu.offerCourse(c8);
 cu.offerCourse(c9);
 cu.offerCourse(c10);
 cu.offerCourse(c11);
 cu.offerCourse(c12);
 cu.offerCourse(c13);
 cu.offerCourse(c14);
 cu.offerCourse(c15);
 cu.offerCourse(c16);
 cu.offerCourse(c17);
 cu.offerCourse(c18);
 cu.offerCourse(c19);
 cu.offerCourse(c20);
 cu.offerCourse(c21);
 cu.offerCourse(c22);
 cu.offerCourse(c23);
 cu.offerCourse(c24);
 cu.offerCourse(c25);
 cu.offerCourse(c26);
 cu.enrollStudentInCourse(s1, c1);
 cu.enrollStudentInCourse(s1, c5);
 cu.enrollStudentInCourse(s1, c11);
 cu.enrollStudentInCourse(s1, c16);
 cu.enrollStudentInCourse(s2, c4);
 cu.enrollStudentInCourse(s2, c8);
 cu.enrollStudentInCourse(s2, c15);
 cu.enrollStudentInCourse(s3, c3);
 cu.enrollStudentInCourse(s3, c7);
 cu.enrollStudentInCourse(s3, c23);
 cu.enrollStudentInCourse(s3, c24);
 cu.enrollStudentInCourse(s3, c25);
 cu.enrollStudentInCourse(s4, c8);
 cu.enrollStudentInCourse(s4, c5);
 cu.enrollStudentInCourse(s4, c11);
 cu.enrollStudentInCourse(s4, c16);
 cu.enrollStudentInCourse(s5, c7);
 cu.enrollStudentInCourse(s5, c14);
 cu.enrollStudentInCourse(s5, c18);
 cu.enrollStudentInCourse(s5, c26);
 cu.enrollStudentInCourse(s6, c8);
 cu.enrollStudentInCourse(s6, c9);
 cu.enrollStudentInCourse(s6, c10);
 cu.enrollStudentInCourse(s6, c15);
 cu.enrollStudentInCourse(s7, c2);
 cu.enrollStudentInCourse(s7, c21);
 cu.enrollStudentInCourse(s7, c17);
 cu.enrollStudentInCourse(s7, c12);
 cu.enrollStudentInCourse(s7, c13);
 cu.enrollStudentInCourse(s7, c6);
 cu.enrollStudentInCourse(s8, c3);
 cu.enrollStudentInCourse(s8, c14);
 cu.enrollStudentInCourse(s8, c22);
 cu.enrollStudentInCourse(s9, c19);
 cu.enrollStudentInCourse(s9, c21);
 cu.enrollStudentInCourse(s10, c1);
 cu.enrollStudentInCourse(s1, c27); // Should not work because course is not offered
 cu.enrollStudentInCourse(s4, c11); // This student is already registered in this course, and should not be added twice
 cu.enrollStudentInCourse(s4, c11); // Again this should not work
 System.out.println("The University looks as follows: " + cu); // 10 students & 26 courses
 System.out.println("Attempting to cancel \" Introductory Biology I\"...");
 cu.cancelCourse(c1); // Should not work, but should not stop program either
 System.out.println("The University still looks as follows: " + cu); // 10 students & 26 courses
 System.out.println("Attempting to cancel \" Professional Sandwich Making\"...");
 cu.cancelCourse(c27); // Should not work, but should not stop program either
 System.out.println("The University still looks as follows: " + cu); // 10 students & 26 courses
 System.out.println("Attempting to cancel \"Introduction to Research Methods in Psychology\"...");
 cu.cancelCourse(c20); // Should work ok
 System.out.println("The University now looks as follows: " + cu); //10 students & 25 courses
 System.out.println("Adding \" Introduction to Research Methods in Psychology\" again... ");
 cu.offerCourse(c20);
 System.out.println("\nThe courses with no students are: " + cu.lowRegistrationCourses(0)); // only c20
 System.out.println("\nThe courses with one student or less are: " + cu.lowRegistrationCourses(1)); // all these c2,c4,c6,c9,c10,c12,c13,c17,c18,c19,c20,c22,c23,c24,c25,c26
 System.out.println("\nThe course with the highest enrollment is " + cu.highestEnrollment()); // Micro Computers in Engineering
 System.out.println("The busiest student is " + cu.busiestStudent());
 System.out.println("\nThe classmates of Keanu Reeves are: " + s3.classmatesAt(cu));
 System.out.println("The classmates of Clint Eastwood are: " + s7.classmatesAt(cu));
 System.out.println("The University looks as follows: " + cu); // 10 students & 26 courses
 System.out.println("Clint Eastwood is taking these courses: " + s7.getStudentCourses()); // should be 6 courses
 System.out.println("Withdrawing Clint Eastwood from \"Human Anatomy and Physiology I\" and from \"Linear Circuit Analysis I\"...");
 cu.withdrawStudentFromCourse(s7, c2); // Should work ok
 cu.withdrawStudentFromCourse(s7, c6); // Should work ok
 System.out.println("Clint Eastwood is now taking these courses: " + s7.getStudentCourses()); // should be 4 courses
 System.out.println("\nThe busiest student now is " + cu.busiestStudent());// Keanu Reeves
 System.out.println("\nThe courses with no students are: " + cu.lowRegistrationCourses(0)); // now c2, c6 and c20
  }
}