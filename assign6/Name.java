package assign6;

import java.util.*;



public class Name implements Sortable{
	
	public String firstName;
	public String middleName;
	public String lastName;
	
	public Name(){
		
	}
	
	public Name(String fullname){
		
		StringTokenizer myTokens = new StringTokenizer(fullname, " ");
		
		if (myTokens.countTokens() == 2){
			this.firstName = myTokens.nextToken();
			this.middleName = null;
			this.lastName = myTokens.nextToken();
		}
		else
		{
			this.firstName = myTokens.nextToken();
			this.middleName = myTokens.nextToken();
			this.lastName = myTokens.nextToken();
		}
	}
	
	public Name(Name copy){
		if (copy == null)
		{
			System.out.println("Fatal error.");
			System.exit(0); 
		}
		else if (this.middleName == null){
			firstName = copy.firstName;
			lastName = copy.lastName;
		}
		else
		{
			firstName = copy.firstName;
			middleName = copy.middleName;
			lastName = copy.lastName;
		}
	}	
		
	public void setName(String newfirstName, String newmiddleName, String newlastName){
		if (newmiddleName == null){
			firstName = newfirstName;
			lastName = newlastName;
		}
		else
		{
			firstName = newfirstName;
			middleName= newmiddleName;
			lastName = newlastName;
		}
	}
	
	public String getLName(){
		return lastName;
	}
	public String getFName(){
		return firstName;
	}
	
	public boolean lessThan(Sortable anotherName){
		
		Name temp;
		temp = (Name) anotherName;
		if(getLName().compareTo( temp.getLName() ) < 0){
			return true;
		}
		if(getLName().compareTo( temp.getLName() ) == 0){
			if(getFName().compareTo( temp.getFName() ) < 0){
				return true;
			}
			else return false;
		}
		return false;	
	}
		
	public String toString(){
		if(this.middleName == null)
		{
			return("\"" + this.lastName + ", " + this.firstName + "\"");
		}
		else
		{
			char Initial = this.middleName.charAt(0);
			return("\"" + this.lastName + ", " + this.firstName + " " + Initial + "\"");
		}
	}
}
