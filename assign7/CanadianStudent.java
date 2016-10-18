package assign7;

public abstract class CanadianStudent extends Student{
	
	
	public CanadianStudent(String studentName){
		super(studentName);
	}
	public CanadianStudent(String fullname, int numberOfCoursesTaken){
		super(fullname, numberOfCoursesTaken);
	}

	

	public String findCountry(){
		return "Canada";
	}
}
