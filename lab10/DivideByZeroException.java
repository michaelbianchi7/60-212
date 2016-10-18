package lab10;

public class DivideByZeroException extends  ArithmeticException{
	public DivideByZeroException(){
		super("Can not divide by zero");
	}
}
