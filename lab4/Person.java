package lab4;




public class Person {
	private Name personName;
	private Person spouse;
	
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
		result = "Employee Name: " + personName.toString();
		if(spouse != null){
			result += "\nMarried to: " + spouse.getName().toString();
		}
		return result;
	}
	
	public double getFamilyIncome(){
		double income = 0.0;
		if(this instanceof NewWorker){
			income = ((NewWorker)this).getSalary();
		}
		if(spouse != null){
			if(spouse instanceof NewWorker){
				income += ((NewWorker) spouse).getSalary();
			}
		}
		return income;
	}		
}
