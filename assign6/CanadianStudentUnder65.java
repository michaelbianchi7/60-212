package assign6;

public class CanadianStudentUnder65 extends CanadianStudent{
	private int numberofcourses;
	
	public CanadianStudentUnder65(String studentName) {
		super(studentName);
	}
	
	public CanadianStudentUnder65(String studentName, int numberOfCoursesTaken) {
		super(studentName, numberOfCoursesTaken);
		numberofcourses = numberOfCoursesTaken;
	}
	public double computeFees(){
		if (numberofcourses<= 4){
			return 800.0;
		}else{
			return numberofcourses*200.0;
		}
	}
	public boolean lessThan(Sortable anotherStudent){
		if(anotherStudent instanceof SeniorStudent){
			return false;
		}
		if(anotherStudent instanceof ForeignStudent){
			return false;
		}
		if(anotherStudent instanceof CanadianStudentUnder65){
			return super.lessThan(anotherStudent);
		}
		return false;
	}	
		
}
