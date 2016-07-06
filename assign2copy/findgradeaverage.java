package assign2;

import java.util.*;
import java.util.StringTokenizer;

public class findgradeaverage {

	public static void main (String args[]){
		
		String inputString, tempnumerator, tempdenominator;
		Scanner mykeyboard = new Scanner(System.in);
		System.out.print("Type in grades ex. (91);(24/25)  : ");
		inputString = mykeyboard.nextLine();
		double added = 0, numerator, denominator=0;
		
		StringTokenizer myTokens = new StringTokenizer(inputString,";)(");
		int numTokens = myTokens.countTokens();
		while ( myTokens.hasMoreTokens()){//checks if there are more words in the string
			String temp = myTokens.nextToken();
			
			
			
			StringTokenizer myTokens2 = new StringTokenizer(temp,"/");//get ride of / to make each 2 numbers seperate tokens at the same time
			while(myTokens2.hasMoreTokens()){//ckeck if there are more works in the string
				
				if(myTokens2.countTokens()==2){
					tempnumerator = myTokens2.nextToken();//find numerator
					tempdenominator = myTokens2.nextToken();//find denominator
					numerator = Double.parseDouble(tempnumerator);//convert numerator to double
					denominator = Double.parseDouble(tempdenominator);//convert denominator to double
				}
				else
				{
					tempnumerator = myTokens2.nextToken();//find numerator
					numerator = Double.parseDouble(tempnumerator);//convert numerator to doubl
					denominator=100;
				}
					
				
				
				double testgrade = ((numerator*100)/denominator);//finds the grade
				added += testgrade;//adds up all the grades
			}
		}
		double average = added/numTokens;//finds average of all grades
		System.out.println("The average grade is "+average);
	}
}	


