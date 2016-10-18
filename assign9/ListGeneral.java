package assign9;

public class ListGeneral {
	protected Node firstNode; // firstNode can be used by this
	// class and any of its subclass.
	private Node currentNode, previousNode; // These are usable only
	// within this class.

	public ListGeneral(){ // Constructor creates an
		// empty list.
		currentNode = null;
		firstNode = null;
		previousNode = null;
	}

	/* 
	 * The method addAfterCurrent adds a new node with value x 
	 * after the current node.
	 */
	public void addAfterCurrent(Object x){
		if (firstNode == null){
			firstNode = new Node(x, null);
			currentNode = firstNode;
		}
		else{
			Node newNode = new Node(x, currentNode.getNext());
			currentNode.setNext(newNode);
			previousNode = currentNode;
			currentNode = newNode;
		}
	}

	/* 
	 * The  method addBeforeCurrent adds a new node with value x 
	 * before the current node.
	 */
	public void addBeforeCurrent(Object x){
		if (firstNode == null){
			firstNode = new Node(x, null);
			currentNode = firstNode;
		} 
		else {
			Node newNode = new Node(x, currentNode);
			if (previousNode != null) {
				previousNode.setNext(newNode);
			}
			else{
				firstNode = newNode;
			}
			currentNode = newNode;
		}
	}

	/* 
	 * removeCurrent() deletes the current node. This is defined 
	 * only if the list is not empty.
	 */
	public void removeCurrent(){
		Node temp;
		if (listIsEmpty() || endOfList()) return;
		temp = currentNode.getNext();
		/* 
		 * if previousNode is null, firstNode is currentNode.                      
		 */

		if (previousNode == null) {
			firstNode = temp;
		}
		else {
			previousNode.setNext(temp);
		}
		currentNode = currentNode.getNext();
	}

	/* 
	 * listIsEmpty() is true if list is empty.
	 * current() returns the current node.
	 * restart() makes the the first node the current node. 
	 */


	public boolean listIsEmpty(){       
		return firstNode == null;
	}

	public Object currentValue(){
		return currentNode.getValue();
	}

	public void restart(){
		currentNode = firstNode;
		previousNode = null;
	}

	/*   endOfList() is true if current is not pointing to 
	 * any node.
	 */

	public boolean endOfList(){
		return currentNode == null;
	}

	/* getNextNode makes the next node the current node. 
	 * The method returns true if the operation was successful 
	 * otherwise it returns false.
	 */  
	public boolean getNextNode(){
		if (currentNode == null) {
			return false;
		}
		else {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
			return true;
		}
	}	
	/* 
	 * method toString() returns the result of invoking toString() 
	 * on all successive elements of the list.
	 */  	
	
	public String toString(){
		String s = "";
		Node listPtr;
		for(restart(); !endOfList(); getNextNode()){
			s += currentValue() + "\n";
		}
		return s;
	}
	
	public static void main(String a[]){
		ListGeneral myList = new ListGeneral();
		myList.addAfterCurrent("Hello");
		myList.addAfterCurrent("how");
		myList.addAfterCurrent("are");
		myList.addAfterCurrent("you?");
		System.out.println(myList);
		System.out.println("****************");

		myList = new ListGeneral();
		myList.addBeforeCurrent("I");
		myList.addBeforeCurrent("am");
		myList.addBeforeCurrent("fine");
		myList.addBeforeCurrent("Thanks");
		System.out.println(myList);

		System.out.println("??????????????");
		myList.restart();
		myList.getNextNode();
		myList.getNextNode();
		System.out.println(myList.currentValue());
		System.out.println("!!!!!!!!!!!!!!");
		myList.removeCurrent();
		System.out.println("Current Node is " + myList.currentValue());
		System.out.println(myList);
	}
}
