package assign5;

import java.util.*;



public class GroceryInventory {
	
	public static void main (String []arg){
		String Kg = "", item = "",temp ="";
		double numKg = 0.0, priceVar= 0.0, fatVar= 0.0, sugarVar= 0.0;
		int i = 0;
		
		
		Scanner mykeyboard = new Scanner(System.in);
		System.out.print("input grocery list\n");
		String inputString = mykeyboard.nextLine();
		
		String [] input = inputString.split("kg| kgs|Kgs|Kg|loaves|of|dozen");
		for (int x = 0; x<input.length; x++){ 
			temp+= input[x];
		}
		
		StringTokenizer myTokens = new StringTokenizer(temp, " ");
		int numTokens = myTokens.countTokens();
		Food [] list = new Food [numTokens];
		
		
		while ( myTokens.hasMoreTokens()){
			Kg = myTokens.nextToken();
			item = myTokens.nextToken();
			numKg = Double.parseDouble(Kg);
			
			if (item.indexOf("apple") != -1){
				list[i] = new Apple(numKg, item);
			}
			else if(item.indexOf("rice") != -1){
				list[i] = new Rice(numKg, item);
			}
			else if(item.indexOf("chicken") != -1){
				list[i] = new Chicken(numKg, item);
			}
			else if(item.indexOf("bread") != -1){
				list[i] = new Bread(numKg, item);
			}
			else if(item.indexOf("orange") != -1){
				list[i] = new Orange(numKg, item);
			}
			else if(item.indexOf("lamb") != -1){
				list[i] = new Lamb(numKg, item);
			}
			else{
				list[i] = new Shrimp(numKg, item);
			}
			i++;
			
		}
		
	
		System.out.println(list[0].getInventory());
		for (Food groceryList: list){
			if(groceryList instanceof Food){
				priceVar = ((Food)groceryList).price();
				fatVar = ((Food)groceryList).fatAmount();
				sugarVar = ((Food)groceryList). sugarAmount();
				System.out.println("\nItem Information ("+ groceryList.getItem() +")"+ "\n" + "Price: $" + priceVar + "\nFat: " + fatVar + " gm" + "\nSugar: " + sugarVar + " gm" +"\n==============");
				
			}
			
		}
		
	}
	
}
	
	
	
	
		