package university;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String name;
	private String code;
	private List<Student> attended;
	
	
	//constructor
	
	public Course(String name , String code)
	{
		this.name=name;
		this.code=code;
		attended=new ArrayList<>();
	}
	
	//getter and setter



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public List<Student> getAttended() {
		return attended;
	}

	public void registerStudent(Student student) {
		attended.add(student);
		
	}

	

}
