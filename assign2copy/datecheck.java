package assign2;

import java.util.*;
import java.util.regex.Matcher;//to use matcher
import java.util.regex.Pattern;//to use pattern

public class datecheck {

	static Pattern pattern=null;//set both to null to begin
	static Matcher matcher=null;
	
	public static void main (String [] args){
	
		String inputString;
		Scanner mykeyboard = new Scanner(System.in);
		System.out.print("Type in Date to check if its valid: ");
		inputString = mykeyboard.nextLine();
		
		//regular expression
		String patternvalidation="(([0-2][0-9]||[3][0-1])[/-]([0][1-9]||[1][0-2])[/-]([0][0-9]||[1][0-4]))";
		
		pattern = Pattern.compile(patternvalidation);//reads through regular expression and compiles it
		matcher = pattern.matcher(inputString);//checks if input matches the regular expression
		if(matcher.matches())//if it does match print valid
		{
			System.out.println("Date is valid: " +inputString);
		}
			else//else not valid
			{
				System.out.println("ERROR: Date is not valid: " +inputString);
			}
		
	}
}
