package assign9;

public class SearchableTester {
	public static void main(String a[]){
		SearchableList<SearchableDate> myList;
		SearchableList<SearchableDate>.SearchingIterator myIterator, myIterator1;
		Object matchingDate;
		myList = new SearchableList<SearchableDate>();
		SearchableDate aDate;
		myList. insert(new SearchableDate("20/5/2010"));
		myList. insert(new SearchableDate("21/2/2011"));
		myList. insert(new SearchableDate("11/9/2010"));
		myList. insert(new SearchableDate("16/1/2011"));
		myList. insert(new SearchableDate("12/1/2011"));
		myList. insert(new SearchableDate("13/1/2011"));
		myList. insert(new SearchableDate("6/5/2010"));
		myList. insert(new SearchableDate("13/5/2010"));
//		myList. insert(new SearchableDate("10/2/2011"));
		
		aDate = myList.getFirst();
		while (!(aDate== null)){
			System.out.println(aDate);
		    aDate = myList.getNext();
		}
		System.out.println();
		myIterator = myList.getIterator(new Integer(2010));
		matchingDate = myIterator.findFirstMatch();
		while (!(matchingDate == null)){
			System.out.println(matchingDate);
			matchingDate = myIterator.findNextMatch();
		}
		System.out.println();
		myIterator1 = myList.getIterator(new Integer(2011));
		matchingDate = myIterator1.findFirstMatch();
		while (!(matchingDate == null)){
			System.out.println(matchingDate);
			matchingDate = myIterator1.findNextMatch();
		}
	}
}
