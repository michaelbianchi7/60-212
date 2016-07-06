package assign5;

public abstract class Food {
	double quantity;
	String name;
	double [] beginningofdayinventory = new double [100];
	
	//==========================================
	//inventory at the beginning of the day
	protected static double Apple = 1000.0;
	protected static double Orange = 1000.0;
	protected static double Bread = 1000.0;
	protected static double Rice = 1000.0;
	protected static double Lamb = 1000.0;
	protected static double Chicken = 1000.0;
	protected static double Shrimp = 1000.0;
	
	protected static double Applecopy = 1000.0;
	protected static double Orangecopy = 1000.0;
	protected static double Breadcopy = 1000.0;
	protected static double Ricecopy = 1000.0;
	protected static double Lambcopy = 1000.0;
	protected static double Chickencopy = 1000.0;
	protected static double Shrimpcopy = 1000.0;
	//==========================================

	
	
	public Food(double quantity, String name){
		this.quantity = quantity;
		this.name = name;
	}
	
	public String getItem(){
		return name;
	}
	
	public String getInventory(){
		String result = "";
		
		result = ("\nBeginning of day (inventory)\n===================\nApples: " +  Applecopy +" Kg(s)"+ "\nOranges: " + Orangecopy +" Dozen"+ "\nBread: " +Breadcopy +" Loaves"+ "\nRice: " + Ricecopy  +" Kg(s)"+ "\nLamb: "+ Lambcopy +" Kg(s)"+ "\nChicken " + Chickencopy +" Kg(s)"+"\nShrimp: "+ Shrimpcopy +" Kg(s)"+ "\n===================");
		result += ("\nAfter purchase (inventory)\n===================\nApples: " +  Apple +" Kg(s)"+ "\nOranges: " + Orange +" Dozen"+ "\nBread: " +Bread +" Loaves"+ "\nRice: " + Rice  +" Kg(s)"+ "\nLamb: "+ Lamb +" Kg(s)"+ "\nChicken " + Chicken +" Kg(s)"+"\nShrimp: "+ Shrimp +" Kg(s)"+ "\n===================");
		return result;
	}
	
	public abstract double price();
	public abstract double fatAmount();
	public abstract double sugarAmount();
}


