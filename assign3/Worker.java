package assign3;



import lab3.MyDate;

class Worker {
	
	private static int howManyWorkers = 0;
	private int workerNumber;
	private Name workerName;
	private MyDate dateJoiningCompany;
	private double Salary;
	private Worker Supervisor;
	
	
	public Worker(String NameofWorker, String DateJoining, double theSalary){
		this(NameofWorker, DateJoining);
		this.Salary = theSalary;
	}
	
	public Worker(String NameofWorker, String DateJoining){
		
		workerName = new Name(NameofWorker);
		dateJoiningCompany = new MyDate(DateJoining);
		this.Salary = 0.0;
		howManyWorkers++;
		workerNumber = howManyWorkers;
	}
	
	public Worker(Worker copy){
		if (copy == null)
		{
			System.out.println("Fatal error.");
			System.exit(0); 
		}
		
		workerName = copy.workerName;
		dateJoiningCompany = copy.dateJoiningCompany;
		Salary = copy.Salary;
	}
	
	public static int getHowManyWorkers(){
		return howManyWorkers;
	}
	
	public void setSalary(double newSalary){
		this.Salary = newSalary;
	}
	
	public void setSupervisor(Worker thisWorkersSupervisor){
		this.Supervisor = thisWorkersSupervisor;
	}
	
	
	
	public Name getSupervisorName(){
		if(Supervisor == null){
			return null;
		}
		else
		{
			return (new Name(Supervisor.workerName));
		}
	}
	
	public String toString(){
		String idnum = Integer.toString(workerNumber);
		if(Supervisor == null){
			return ("\nEmployee Number: " + idnum + "\nEmployee Name: " + workerName.toString() + "\nStart date: " + dateJoiningCompany.toString() + "\nSalary: " + this.Salary);
		}
		else
		{
			return ("\nEmployee Number: " + idnum + "\nEmployee Name: " + workerName.toString() + "\nStart date: " + dateJoiningCompany.toString() + "\nEmployees Supervisor: " +getSupervisorName().toString() + "\nSalary: " + this.Salary);
		}
	}
	
		public static void main(String[] args) {
			Worker w1, w2, w3;
			w1 = new Worker ("Robert  William Hunter", "23/10/2005", 35000.00);
			w2 = new Worker ("John Smith", "15/11/2005", 25000.00);
			w3 = new Worker ("Mary Jane Hull", "06/09/2007");
			w2. setSalary(20000.00);
			w2.setSupervisor(w1);
			w3.setSupervisor(w1);
			System.out.println("Number of workers = " + Worker.getHowManyWorkers() +" \n");
			System.out.println("Supervisor of John is " + w2.getSupervisorName());
			System.out.println(w1.toString()+" \n");
			System.out.println(w2.toString()+" \n");
			System.out.println(w3.toString()+" \n");
	}
}

