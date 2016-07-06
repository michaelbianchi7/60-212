package lab3;


import java.util.StringTokenizer;

public class MyDate {

	public int day;
	public int month;
	public int year;
	
	
	public MyDate(String date){
		StringTokenizer myTokens = new StringTokenizer(date, "/");
		this.day = Integer.parseInt(myTokens.nextToken());
		this.month = Integer.parseInt(myTokens.nextToken());
		this.year = Integer.parseInt(myTokens.nextToken());
	}
	
	public MyDate(MyDate copy){
		if (copy == null)
		{
			System.out.println("Fatal error.");
			System.exit(0); 
		}
		day = copy.day;
		month = copy.month;
		year = copy.year;
	}
	
	
	public boolean lessThan(MyDate copy){
		if(this.year<copy.year){
			
			return true;
		}
		else if(this.year>copy.year)
		{
			return false;
		}
		else if(this.year==copy.year && this.month<copy.month)
		{
			return true;
		}
		else if(this.year==copy.year && this.month>copy.month)
		{
			return false;
		}
		else if(this.year==copy.year && this.month==copy.month && this.day<copy.day)
		{
			return true;
		}
		else if(this.year==copy.year && this.month==copy.month && this.day>copy.day)
		{
			return false;
		}
		else 		
		{
			return false;
		}
	}
	
	public boolean equals(MyDate copy){
		if(this.year==copy.year && this.month==copy.month && this.day==copy.day)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString (){
		
		String Lettermonth="";
		
		if (month == 1){
			Lettermonth = "January";
		}
		else if (month == 2){
			Lettermonth = "Febuary";
		}
		else if (month == 3){
			Lettermonth = "March";
		}
		else if (month == 4){
			Lettermonth = "April";
		}
		else if (month == 5){
			Lettermonth = "May";
		}
		else if (month == 6){
			Lettermonth = "June";
		}
		else if (month == 7){
			Lettermonth = "July";
		}
		else if (month == 8){
			Lettermonth = "August";
		}
		else if (month == 9){
			Lettermonth = "September";
		}
		else if (month == 10){
			Lettermonth = "October";
		}
		else if (month == 11){
			Lettermonth = "November";
		}
		else{
			Lettermonth = "December";
		}
		
		if (this.year%100 == 0)
		{
			return ("\"" + Lettermonth + " " + this.day + ", '" + "0" + this.year%100 + "\"");
		}
		return("\"" + Lettermonth + " " + this.day + ", '" + this.year%100 + "\"");
		
	}
}