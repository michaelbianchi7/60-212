package lab5;

public class Household {
	private Person [] householdMembers;
	

	public Household(){
		householdMembers = new Person[10];
	}
	public Household(int size){
		householdMembers = new Person[size];
	}
	public void insertNewHouseholdMember(Person person){
		int i = 0;
		while(householdMembers[i] != null){
			i++;
		}
		householdMembers[i] = person;
		
	}
	public String toString(){
		String family = "";
		for(Person people: householdMembers){
			family += people.toString() + "\n";
		}
		return family;
	}
}
