package lab6;

public class Household{
	private Person [] householdMembers;
	private static int howManyPeople = 0;
	
	
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
		howManyPeople++;
	}
	
	public int findNumberOfFatCats(){
		int fatcats = 0;
		for(int i=0; i<howManyPeople; i++){
			if (householdMembers[i].fatCat() == true){
				fatcats++;
			}
		}
		return fatcats;
	}
	
	public String sortHouseholdMembers(){
		Sort.sortAnything(householdMembers, howManyPeople);
		String family = "";
		for(Person people: householdMembers){
			if(people != null){
				family += people.toString() + "\n";
			}
		}
		return family;
	}
	
	public String toString(){
		String family = "";
		for(Person people: householdMembers){
			if(people != null){
				family += people.toString() + "\n";
			}
		}
		return family;
	}
}
