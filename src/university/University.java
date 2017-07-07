package university;

import java.util.ArrayList;
import java.util.List;

public class University {
	
	//properties
	
	private String name;
	
	//students registered in the university
	
	List<Student> students;
	
	
	//courses in the university
	
	List<Course> courses;
	
	//constructor
	
	public University(String name)
	{
		this.name=name;
		students=new ArrayList<>();
		courses=new ArrayList<>();
	}

	//methods
	
	public void registerStudent(Student s)
	{
		if(students.contains(s))
			System.out.println("student already registered");
		else
		students.add(s);
	}
	
	public void createCourse(Course c)
	{
		if(courses.contains(c))
			System.out.println("course is already created");
		else
		courses.add(c);
	}
	
	public void registerStudentInCourse(String id ,String code)
	{
		
		for(Student s: students)
		{
			if(s.getId().equals(id)){
				for(Course c :courses)
				{
					if(c.getCode().equals(code)){
						c.registerStudent(s);
						s.addCourse(c);
					}
				}
			}
		}
		
		
		
		
	}

	//given a course show students
	public void showStudentsCourse(String code) {
		
		for(Course c : courses)
		{
			if(c.getCode().equals(code))
			{
				for(Student s: c.getAttended())
					System.out.println(s.getName()+"\t"+s.getId());
				return;
			}
		}
	}
	//given student given courses
	public void showStudentCourses(String id) {
		
		for(Student s: students)
		{
			if(s.getId().equals(id))
			{
				for(Course c : s.getEnrolled())
					System.out.println(c.getName()+"\t"+c.getCode());
			}
		}
		
		
		
	}
	
	public void showAllStudents()
	{
		for(Student s: students)
			System.out.println(s.getName()+"\t"+s.getId());
	}
	

}
