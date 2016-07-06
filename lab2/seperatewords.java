package lab2;
import java.util.*; 
import java.io.*;
import java.util.Scanner;
public class seperatewords {
	
	
	public static void main(String[] args)throws IOException{
		
		Scanner mykeyboard = new Scanner(System.in);
		System.out.print("Type a line of text: ");
		String inputString = mykeyboard.nextLine();
			//find largest word
			inputString=inputString+" "; //adding a space at the end, to extract the last word also
	        int len=inputString.length(); //finding the length of the sentence
	        String x="",maxw="";
	        char ch;
	        int p,maxl=0;
	 
	        for(int i=0;i<len;i++)
	        {
	            ch=inputString.charAt(i); //Extracts chars from the string one by one
	            if(ch!=' ')
	            {
	                x=x+ch; //Adds chars in order to form a work, only if char has no spaces
	            }
	            else
	            {
	                p=x.length();
	
	                if(p>maxl) //max length checker
	                {
	                    maxl=p;
	                    maxw=x;
	                }
	                x=""; //set temp to empty in order to store the next word
	            }
	        }
	        System.out.println("The longest word is "+"\""+maxw+"\""+"\nWord Length = "+maxl);
	    
	    int count=0;//find number of vowels in largest word
		int longestwordlength = maxw.length();
		for(int k=0; k<longestwordlength; k++){
			if((maxw.charAt(k) == 'a') || (maxw.charAt(k) == 'e') || (maxw.charAt(k) == 'i') || (maxw.charAt(k) == 'o') || (maxw.charAt(k) == 'u') || (maxw.charAt(k) == 'A') || (maxw.charAt(k) == 'E') || (maxw.charAt(k) == 'I') || (maxw.charAt(k) == 'O') || (maxw.charAt(k) == 'U')){
				count++;
			}
		}
		System.out.println("The total number of vowels in longest word is "+count +"\n");
	    
		//parse the words in the string on to seperate lines
		StringTokenizer myTokens = new StringTokenizer(inputString," ");
		int i=1;
		while ( myTokens.hasMoreTokens()){//checks if there are more words in the string
			System.out.println("Word "+ i +": "+ myTokens.nextToken());//if so it prints the next word
			i++;
		}
	}
}

