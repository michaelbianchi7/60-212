package lab5;

public class Student extends Person {
	
	private String Major;
	
	public Student(String fullName, String major) {
		super(fullName);
		Major = major;
	}
	
	public double getSalary(){
		return 0.0;
	}
	
	public String toString(){
		return super.toString() + "\nMajor:" +Major;
	}

	@Override
	public double getFamilyIncome() {
		double money = 0.0;
		if(spouse != null) money += spouse.getSalary();
		return money;
	}
	
}
