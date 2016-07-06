package assign4;

public class Assign4Tester {

	public static void main(String[] args){
		NewWorker w1, w2, w3, w4, w5, w6, w7;
		Manager m1, m2;
	
		m1 = new Manager ("Bert Sanders Huggington", "03/11/2015", 45000.00);
		m2 = new Manager ("Jim bethim", "25/12/2000", 15000.00);
	
		w1 = new NewWorker ("Robert William Hunter", "23/10/2005", 35000.00);
		w2 = new NewWorker ("John Smith", "15/11/2005", 25000.00);
		w3 = new NewWorker ("Mary Jane Hull", "06/09/2007");
		w4 = new NewWorker ("Richard M. Harry", "01/08/2004");
		w5 = new NewWorker ("Jessica Chowhan", "21/01/2006", 30000.00);
		w6 = new NewWorker ("Jad links", "01/21/2016", 40000.00);
		w7 = new NewWorker ("Fred buckle", "11/11/2016", 50000.00);
	
		
		
		m1.addWorker(w1);
		m1.addWorker(w2);
		m1.addWorker(w3);
		m2.addWorker(w4);
		m2.addWorker(w5);
		m2.addWorker(w6);
		m2.addWorker(w7);
		
		
		System.out.println("Supervisor of m1 is " + m1.getSupervisor());
		System.out.println("\nM1 IS " + m1);
		System.out.println("\nM2 IS " + m2);
		m2.deleteWorker(w7);
		System.out.println("\n**********************************************");
		System.out.println("\nM2 IS NOW " + m2);
		System.out.println("\n**********************************************");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
