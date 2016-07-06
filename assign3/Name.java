package assign3;

import java.util.*;

//import lab3.MyDate;

public class Name {
	
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
