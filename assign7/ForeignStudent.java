package assign7;

public class ForeignStudent extends Student{
	private String countryOfOrigin;
	private int numberofcourses;
	
	public ForeignStudent(String studentName, int numberOfCoursesTaken, String countryOfOrigin, MyDate dateOfEntryToCanada){
		super(studentName, numberOfCoursesTaken);
		this.countryOfOrigin = countryOfOrigin;
		numberofcourses = numberOfCoursesTaken;
		
	
	}
	
	public double computeFees(){
		return numberofcourses*1000.0;
	}
	
	public String findCountry(){
		return countryOfOrigin;
	}
	
	public boolean lessThan(Sortable anotherStudent){
		
		if(anotherStudent instanceof SeniorStudent){
			return false;
		}
		if(anotherStudent instanceof ForeignStudent){
			return super.lessThan(anotherStudent);
		}
		if(anotherStudent instanceof CanadianStudentUnder65){
			return true;
		}
		return false;
		
		/*Student temp;
		temp = (Student) anotherStudent;
		if(anotherStudent instanceof ForeignStudent){
			if(getStudentName().compareTo(temp.getStudentName() ) < 0){
				return true;
			}else{
				return false;	
			}
		}else {
			return false;	
		}*/
	}
}
