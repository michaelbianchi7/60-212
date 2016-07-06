package lab1;

public class FindNestPrime {
	public static void main (String args[]){
		
		int nestPrime;
		int numberSupplied =42;
		nestPrime = numberSupplied;
		double x= Math.sqrt(numberSupplied);
		int j;
		boolean isPrime = false;
		
		while (!isPrime){
			for (j=2; j<=x; j++){
				if (nestPrime%j==0){
					isPrime = false;
					nestPrime ++;
				}
				else {
					isPrime = true;
				}
			}
		}
	System.out.println("The first prime number greater than " + numberSupplied + " is " + nestPrime);

	}
}