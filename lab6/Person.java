package lab6;

public abstract class Person implements HighIncome, Sortable {
	private Name personName;
	protected Person spouse;
	static int NumberOfFatCats = 0;
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
	
	public boolean lessThan(Sortable anotherName){
		Person temp;
		temp = (Person) anotherName;
		if(getLastName().compareTo(temp.getLastName() ) < 0){
			return true;
		}
		if(getLastName().compareTo(temp.getLastName() ) == 0){
			if(getFirstName().compareTo( temp.getFirstName() ) < 0){
				return true;
			}
			else return false;
		}
		return false;	
	}
	
	protected int getFatCatnum(){
		return NumberOfFatCats;
	}
	
	public boolean fatCat(){
		double salary = this.getSalary();
		if (salary >= 3000.0){
			NumberOfFatCats++;
			return true;
		}
		return false;
	}
	
	public String toString(){
		String result;
		result = "\nName is: " + personName.toString();
		if(spouse != null){
			result += "\nMarried to: " + spouse.getName().toString();
		}
		return result;
	}	
	
	public String getLastName(){
		String[] names = personName.toString().split(" ");
		names[0] = names[0].split(",")[0];
		if(names[1].indexOf('.') != 0){
			names[1] = names[1].substring(0,names[1].length() - 2);
		}
		String name = names[0];
		return name;
	}
	
	public String getFirstName(){
		String[] names = personName.toString().split(" ");
		names[0] = names[0].split(",")[0];
		if(names[1].indexOf('.') != 0){
			names[1] = names[1].substring(0,names[1].length() - 2);
		}
		String name = names[1];
		return name;
	}
}

