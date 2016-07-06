package assign6;

public abstract class Student implements FeeCalculator, Sortable{
	
	private int studentNumber, numberOfCoursesTaken, i;
	private String studentName;
	
	public abstract String findCountry();//return the country, might need defining
	
	public Student(String studentName){
		this.studentName = studentName;
		studentNumber++;
	}
	
	public boolean lessThan(Sortable anotherStudent){
		if(anotherStudent instanceof Student){
			Student temp;
			temp = (Student) anotherStudent;
			if(getStudentName().compareTo(temp.getStudentName()) < 0){
				return true;
			}return false;	
		}return false;	
	}
	
	public Student(String studentName, int numberOfCoursesTaken){
		this.studentName = studentName;
		this.numberOfCoursesTaken = numberOfCoursesTaken;
		i++;
		studentNumber = i;
	}
	
	
		
	
	
	protected int getNumberOfCoursesTaken(){
		return numberOfCoursesTaken;
	}
	
	protected String getStudentName(){
		return studentName;
	}
	
	public String toString(){
		String result;		
		
		if(this.computeFees() == 50.0){
			result = "Student #:" + Integer.toString(studentNumber) + ", Name:" + studentName + " is from " + findCountry() + "; pays fees $" + computeFees() + " senior citizen who gets pension $"; 
		}else{
			result = "Student #:" + Integer.toString(studentNumber) + ", Name:" + studentName + " is from " + findCountry() + "; pays fees $" + computeFees();

		}
		return result;
	}
}
