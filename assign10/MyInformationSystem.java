package assign10;

import java.util.ArrayList;

public class MyInformationSystem <T>{
	
//=======================================================================================================	
//inner class
//=======================================================================================================		
	@SuppressWarnings("hiding")
	private class Pair <T>{
		private T value;
		private String key;
		public Pair(T value, String key){
			this.value = value;
			this.key = key;
		}
		
		public boolean keyMatches(String keyValue){
			if(keyValue == key){
				return true;
			}else{
				return false;
			}
		}
	}
//=======================================================================================================			
//Outer class	
//=======================================================================================================	
	ArrayList <Pair> myList;
	Pair<T> pair;
	public MyInformationSystem(){
		myList = new ArrayList <Pair> (4);
	}
	
	public void insert(T value, String key){
		pair = new Pair<T>(value, key);
		myList.add(pair);
		
	}
	
	@SuppressWarnings("unchecked")
	public T retrieve(String keyValue) throws Exception{
		
		for(int i = 0; i < myList.size(); i++){
			if(myList.get(i) instanceof Pair){
				if((myList.get(i)).keyMatches(keyValue)){
					return (T) myList.get(i).value;
				}
			}
		}	
		throw new Exception();
	}	
	
//=======================================================================================================
//Main
//=======================================================================================================

public static void main(String a[]){ 
	
	String result;
	String keyList[] = {"126", "536", "428", "245"}; 
	MyInformationSystem<String> nameStudentNumberList; 
	nameStudentNumberList = new MyInformationSystem<String>(); 
	nameStudentNumberList.insert("John", "245");// John has
	nameStudentNumberList.insert("Tom", "126"); 
	nameStudentNumberList.insert("Mary", "536"); 
	nameStudentNumberList.insert("Mark", "821");
	
	for (int i = 0; i < keyList.length; i++){ 
		
		try{
			result = nameStudentNumberList.retrieve(keyList[i]); 
			System.out.println("For key " + keyList[i] + " the matching value is " + result); 
			
		}
		catch(Exception e){
			System.out.println("No Match with " + keyList[i]);
			System.out.println(e.getMessage());
		}
	}
		
}			
}
