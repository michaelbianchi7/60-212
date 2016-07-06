package lab2;
import java.util.*;
import java.util.regex.Matcher;//to use matcher
import java.util.regex.Pattern;//to use pattern

public class checkname {
	
	static Pattern pattern=null;//set both to null to begin
	static Matcher matcher=null;
	
	public static void main (String [] args){
	
		String inputString;
		Scanner mykeyboard = new Scanner(System.in);
		System.out.print("Type in name to check if its valid: ");
		inputString = mykeyboard.nextLine();

		
		//regular expression
		String patternvalidation="([M][rs] )?([A-Z][a-z]+)( [A-Z]|| [A-Z][a-z]+)?( [A-Z][a-z]+)";
		
		pattern = Pattern.compile(patternvalidation);//reads through regular expression and compiles it
		matcher = pattern.matcher(inputString);//checks if input matches the regular expression
		if(matcher.matches())//if it does match print valid
		{
			System.out.println("Name is valid: " +inputString);

			StringTokenizer myTokens = new StringTokenizer(inputString," ");
			if (myTokens.countTokens()==2){
				System.out.println(myTokens.nextToken());
			}
			else if (myTokens.countTokens() == 3)
			{
				String temp = myTokens.nextToken();
				if (temp.equals("Ms")||temp.equals("Mr"))
				{
					System.out.println(myTokens.nextToken() + myTokens.nextToken());
				}
				else
				{
					System.out.println(myTokens.nextToken());
					myTokens.nextToken();
					System.out.println(myTokens.nextToken());
				}
			}
			else
			{
				myTokens.nextToken();
				System.out.println(myTokens.nextToken());
				myTokens.nextToken();
				System.out.println(myTokens.nextToken());
			}
		}	
				
		else//else not valid
		{
			System.out.println("ERROR: name is not valid: " +inputString);
		}
		//while ( myTokens.hasMoreTokens()){//checks if there are more words in the string
			//System.out.println(myTokens.nextToken());//if so it prints the next word
		//}	
	
	}
}
