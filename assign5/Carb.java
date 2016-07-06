package assign5;

public abstract class Carb extends Food{
	public double price = 0.0;
	public double fat = 0.0;
	public double sugar = 0.0;
	
	public Carb(double quantity, String name){
		super(quantity,name);
	}
	
}

class Bread extends Carb{
		
	public Bread(double quantity, String name) {
		super(quantity, name);
		Bread -= quantity;
	}
	
	public double price(){
		price = 3.0;
		double result = price*quantity;
		return result;
	}
	
	public double fatAmount(){
		return fat;
	}
	
	public double sugarAmount(){
		sugar = 500.0;
		double result = sugar*quantity;
		return result;
	}
}

	
class Rice extends Carb{

	public Rice(double quantity, String name) {
			super(quantity, name);
			Rice -= quantity;
	}
	
	public double price(){
		price = 1.0;
		double result = price*quantity;
		return result;
	}
	
	public double fatAmount(){
		return fat;
	}
	
	public double sugarAmount(){
		sugar = 600.0;
		double result = sugar*quantity;
		return result;
	}
		
}

