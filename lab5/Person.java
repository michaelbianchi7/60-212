package lab5;

public abstract class Person {
	private Name personName;
	protected Person spouse;
	
	public abstract double getFamilyIncome();
	public abstract double getSalary();
	
	protected Name getName(){
		return personName;
	}
	
	public Person(String fullName){
		this.personName = new Name (fullName);
	}
	
	public void setSpouse(Person spouse){
		this.spouse = spouse;
	}
	
	
	public String toString(){
		String result;
		result = "\nName is: " + personName.toString();
		if(spouse != null){
			result += "\nMarried to: " + spouse.getName().toString();
		}
		return result;
	}	
}

