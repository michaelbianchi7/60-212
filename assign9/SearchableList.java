package assign9;



public class SearchableList<T extends Searchable> {
	private SearchableList<T> myList;
	private ListGeneric aList;
	
	public SearchableList(){
		aList = new ListGeneric();
	}
	
	
	
	public void insert(T x){
		if(aList.listIsEmpty()){//empty list
			aList.addBeforeCurrent(x);
			aList.restart();
			return;
		}if(aList.endOfList()) {
			aList.addBeforeCurrent(x);
			aList.restart();
			return;
		}
		aList.getNextNode();
		insert(x);
	}
	
	
	public T getFirst(){
		aList.restart();
		if(aList.listIsEmpty()){
			return null;
		}else{
			if(aList.currentValue() instanceof SearchableDate){
				return (T) aList.currentValue();
			}
		}
		return null;
	}
	
	public T getNext(){
		aList.getNextNode();
		if(aList.endOfList()){
			aList.restart();
			return null;
		}
		return  (T) aList.currentValue();
		
		
	}
	
	public SearchingIterator getIterator(Object key){
		SearchingIterator search = new SearchingIterator(key);
		return search;
	}
	
	
	
	
	
//===========================================================================================	
	
	
	
	
	
	
	public class SearchingIterator{
		public Object keyToSearchFor;
		
		public SearchingIterator(Object x){
			keyToSearchFor = x;
		}
		
		public T findFirstMatch(){
			if(aList.endOfList()){
				aList.restart();
				return null;
			}
			if(keyMatches(aList.currentValue())){
				return (T) aList.currentValue(); 
			}
			
			aList.getNextNode();
			return findFirstMatch();
		}
		
		public T findNextMatch(){
			aList.getNextNode();
			
			if(aList.endOfList()){
				aList.restart();
				return null;
			}
			if(keyMatches(aList.currentValue())){
				return (T) aList.currentValue(); 
			}
			
			
			return findNextMatch();
			
		}
		
		public boolean keyMatches(Object key){
			if(((T) key).keyMatches(keyToSearchFor)){
				return true;
			}else{
				return false;
			}
		}
	}
}
