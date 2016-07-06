package assign5;

public abstract class Meat extends Food{
	public double price = 0.0;
	public double fat = 0.0;
	public double sugar = 0.0;
	
	public Meat(double quantity, String name){
		super(quantity,name);
	}
}

class Shrimp extends Meat{

	public Shrimp(double quantity, String name) {
		super(quantity, name);
		Shrimp -= quantity;
	}
	
	public double price(){
		price = 20.99;
		double result = price*quantity;
		return result;
	}
	
	public double fatAmount(){
		fat = 50.0;
		double result = fat*quantity;
		return result;
	}
	
	public double sugarAmount(){
		return sugar;
	}
	
}

class Chicken extends Meat{

	public Chicken(double quantity, String name) {
		super(quantity, name);
		Chicken -= quantity;
	}

	public double price(){
		price = 10.99;
		double result = price*quantity;
		return result;
	}
	
	public double fatAmount(){
		fat = 100.0;
		double result = fat*quantity;
		return result;
	}
	
	public double sugarAmount(){
		return sugar;
	}
	
}

class Lamb extends Meat{

	public Lamb(double quantity, String name) {
		super(quantity, name);
		Lamb -= quantity;
	}

	public double price(){
		price = 25.99;
		double result = price*quantity;
		return result;
	}
	
	public double fatAmount(){
		fat = 230.0;
		double result = fat*quantity;
		return result;
	}
	
	public double sugarAmount(){
		return sugar;
	}
}
