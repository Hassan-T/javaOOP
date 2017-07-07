package university;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private String id;
	private List<Course> enrolled;
	
	
	public Student(String name , String id)
	{
		this.name=name;
		this.id=id;
		enrolled=new ArrayList<>();
	}
	
	
	
	//getters and setters 
	
	//get the student name
	public String getName() {
		return name;
	}
	
	//set the student name
	public void setName(String name) {
		this.name = name;
	}
	
	
	//get id
	public String getId() {
		return id;
	}
	
	//set id
	public void setId(String id) {
		this.id = id;
	}
	
	//get a list of courses the student attended

	public List<Course> getEnrolled() {
		return enrolled;
	}



	public void addCourse(Course c) {
		enrolled.add(c)
;		
	}
	
	
	
	
	
	
	
	
	
	

}
