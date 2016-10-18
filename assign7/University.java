package assign7;

public class University {
	private Student [] listOfStudents; 
	private static int howManyStudents = 0;
	
	public University(int maximumNumberOfStudents){
		listOfStudents = new Student [maximumNumberOfStudents];
	}
	
	public boolean insertStudent(Student aStudent){
		boolean result = false;
		int i=0;
		while(listOfStudents[i] != null){
			i++;
		}
		listOfStudents[i] = aStudent;
		if(i==10){
			result = false;
		}else{
			result = true;
		}
		howManyStudents++;
		return result;
	}
	
	public int numberOfStudents(String nameOfCountry){
		int canadianStudent = 0; 
		int foreignStudent = 0; 
		int result = 0;
		
		if(nameOfCountry.equals("Canada")){
			for(Student list: listOfStudents){
				if(list instanceof Student){
				if (list.findCountry().equals("Canada")){
					canadianStudent++;
				}
				}
				result = canadianStudent;
			}
		}
		if(nameOfCountry.equals("China")){
			for(Student list2: listOfStudents){
				if(list2 instanceof Student){
				if (list2.findCountry().equals("China")){
					foreignStudent++;
				}
				}
				result = foreignStudent;
			}
		}
		return result;
	}
	
	public String toString(){
		String Student = "Number of students in University = " + howManyStudents + "\n";
		
		for(Student s: listOfStudents){
			if(s != null){
				Student += s.toString() + "\n";
			}
		}
		return Student;
	}
	
	public void sortStudents(){
		Sort.sortAnything(listOfStudents, howManyStudents);
	}
	public void sortStudentsInReverse(){
		Sort.sortAnythingInReverse(listOfStudents, howManyStudents);
	}
	
}
