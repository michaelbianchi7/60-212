package lab4;


public class NewWorker extends Person{
	
	private static int howManyWorkers = 0;
	private int workerNumber;
	private MyDate dateJoiningCompany;
	private double Salary;
	private NewWorker Supervisor;
	
	
	
	//public NewWorker(){
		
	//}
	
	public NewWorker(String NameofWorker){
		super(NameofWorker);
		Salary = 0.0;
	}
	
	public NewWorker(String NameofWorker, String DateJoining, double theSalary){
		super(NameofWorker);
		dateJoiningCompany = new MyDate(DateJoining);
		this.Salary = theSalary;
		howManyWorkers++;
		workerNumber = howManyWorkers;
	}
	
	public NewWorker(String NameofWorker, String DateJoining){
		super(NameofWorker);
		dateJoiningCompany = new MyDate(DateJoining);
		Salary = 0.0;
		howManyWorkers++;
		workerNumber = howManyWorkers;
	}
	
	public static int getHowManyWorkers(){
		return howManyWorkers;
	}
	
	public void setSalary(double newSalary){
		this.Salary = newSalary;
	}
	
	public double getSalary(){
		return Salary;
	}
	
	public void setSupervisor(NewWorker thisWorkersSupervisor){
		this.Supervisor = thisWorkersSupervisor;
	}
	public Name getSupervisor(){
		if(Supervisor == null){
			return null;
		}
		else
		{
			return (new Name(Supervisor.getName()));
		}
	}
	
	public String toString(){
		
		String idnum = Integer.toString(workerNumber);
		if(Supervisor == null){
			return ("\nEmployee Number: " + idnum + "\n" + super.toString() + "\nStart date: " + dateJoiningCompany.toString() + "\nSalary: " + this.Salary + "\n");
		}
		else
		{
			return ("\nEmployee Number: " + idnum + "\n" + super.toString() + "\nStart date: " + dateJoiningCompany.toString() + "\nEmployees Supervisor: " +getSupervisor().toString() + "\nSalary: " + this.Salary + "\n");
		}
	}
}	