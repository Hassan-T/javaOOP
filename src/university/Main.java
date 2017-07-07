package university;

public class Main {

	public static void main(String[] args) {
		//output results
		
		University myuni=new University("AnyUni");
		
		myuni.createCourse(new Course("java","jv35"));
		myuni.createCourse(new Course("cplus","c++"));

		
		myuni.registerStudent(new Student("student1", "i1312"));
		myuni.registerStudent(new Student("student2","i1313"));
		myuni.registerStudent(new Student("mohammad","i13123"));

		
		myuni.registerStudentInCourse("i1313", "jv35");
		myuni.registerStudentInCourse("i1312","jv35");
		myuni.registerStudentInCourse("i1312","c++");
		
		//test
		
		//myuni.showStudentsCourse("jv35");
		//myuni.showStudentCourses("i1313");// java jv35
		//myuni.showStudentsCourse("c++");
		
		myuni.showAllStudents();
	}

}
