package assign5;

public abstract class Fruit extends Food{
	public double price = 0.0;
	public double fat = 0.0;
	public double sugar = 0.0;
	
	public Fruit(double quantity, String name){
		super(quantity,name);
	}
		
}

class Apple extends Fruit{
	
	public Apple(double quantity, String name) {
		super(quantity, name);
		Apple -= quantity;
	}
	
	public double price(){
		price = 1.89;
		double result = price*quantity;
		return result;
	}
	
	public double fatAmount(){
		return fat;
	}
	
	public double sugarAmount(){
		sugar = 200.0;
		double result = sugar*quantity;
		return result;
	}
	
}

class Orange extends Fruit{

	public Orange(double quantity, String name) {
		super(quantity, name);
		Orange -= (12.0*quantity);
	}
	
	public double price(){
		price = 2.36;
		double result = price*quantity;
		return result;
	}
	
	public double fatAmount(){
		return fat;
	}
	
	public double sugarAmount(){
		sugar = 150.0;
		double result = sugar*quantity;
		return result;
	}
	
}
