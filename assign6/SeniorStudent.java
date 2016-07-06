package assign6;

public class SeniorStudent extends CanadianStudent{
	
	private double Pension;
	
	public SeniorStudent(String studentName, int numberOfCoursesTaken, double pension) {
		super(studentName, numberOfCoursesTaken);
		Pension = pension;
		
	}
	
	public double getPension(){
		return Pension;
	}
	
	public double computeFees(){
		return 50.0;
	}
	
	public String toString(){
		String pension = Double.toString(Pension);
		return super.toString() + pension;
	}
	
	public boolean lessThan(Sortable anotherStudent){
		if(anotherStudent instanceof SeniorStudent){
			return super.lessThan(anotherStudent);
		}
		if(anotherStudent instanceof ForeignStudent){
			return true;
		}
		if(anotherStudent instanceof CanadianStudentUnder65){
			return true;
		}
		return false;
		
		
		
	}
}