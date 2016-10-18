package lab9;

//import morelabhelp.Node;

public class SortedListOfInt {
	private ListGeneral myList;
	Node head = null;
	
	public SortedListOfInt(){
		myList = new ListGeneral();
	}
	public void addElement(int value){
		myList.restart();
		addElementR(value);
	}
	public void addElementR(int value){

			if(myList.endOfList()){//empty list
				myList.addBeforeCurrent(value);
			}else if(value >= (Integer)myList.currentValue()){//greater than current value
				myList.getNextNode();
				addElementR(value);
			}else{//adds between in all other cases
				myList.addBeforeCurrent(value);
			}
			
	}
	
	public String retrieve(int firstint, int secondint){
		myList.restart();
		return retrieveR(firstint, secondint);
	}
	
	public String retrieveR(int firstint, int secondint){
		
		if(myList.endOfList()){
			return "";
		}else if((Integer)myList.currentValue()< firstint){
			myList.getNextNode();
			return retrieveR(firstint, secondint);
		}else if(firstint <= (Integer)myList.currentValue() && (Integer)myList.currentValue() <=secondint){
			String result = String.valueOf((Integer)myList.currentValue());
			myList.getNextNode();
			return result + " " + retrieveR(firstint, secondint);
		}else{
			return "";
		}
		
	}
	
	public int deleteElement(int value){
		myList.restart();
		return deleteElementR(value);
	}
	
	public int deleteElementR(int value){
		if(myList.endOfList()){//empty list
			return 0;
		}else if(value != (Integer)myList.currentValue()){
			myList.getNextNode();
			return deleteElementR(value);
		}else{
			myList.removeCurrent();
			return  1 + deleteElementR(value); 
		}	
	}
}	
	

	