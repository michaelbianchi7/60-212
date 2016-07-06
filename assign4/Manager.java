package assign4;

public class Manager extends NewWorker{
	private int numWorkersSupervised = 0;
	//ArrayList<NewWorker> employeesSupervised = new ArrayList<NewWorker>(10);
	NewWorker [] employeesSupervised = new NewWorker[10];
	
	
	public Manager(String NameofWorker, String DateJoining, double theSalary){
		super(NameofWorker, DateJoining, theSalary);
	}
	public Manager(String NameofWorker, String DateJoining){
		super(NameofWorker, DateJoining);
		super.Salary = 0.0;
	}
	
	public double getSalary(){
		if(numWorkersSupervised!=0){
			Salary += (100*(numWorkersSupervised));
		}
		
		return Salary;
	}
	public void addWorker(NewWorker worker){
		int i = 0;
		while(employeesSupervised[i] != null){
			i++;
		}
		employeesSupervised[i] = worker;
		numWorkersSupervised++;
		
			     
	}
	public void deleteWorker(NewWorker worker){
		
		for(int i = 0; i<numWorkersSupervised; i++){
			if(employeesSupervised[i].equals(worker)){
				employeesSupervised[i] = null;
				break;
				
			}
		}
		numWorkersSupervised--;
		Salary -= (100*(numWorkersSupervised))+100;  
		
	}
	
	
	public String toString(){
		
		String result = "";
		for(int i = 0; i<numWorkersSupervised; i++){
			result += "\n" + employeesSupervised[i].getName();
			
		}
		
		if(Supervisor == null){
			return ("\n" + super.toString() + "Salary: " + this.getSalary() + "\n" +  "\n" + "Managers the following employees:\n============================================== " + result + "\n==============================================");
		}
		else
		{
			return ("\n" + super.toString() + "Salary: " + this.getSalary() + "\n" + "\n" + "Managers the following employees:\n============================================== " + result + "\n==============================================");
		}
	}
}
