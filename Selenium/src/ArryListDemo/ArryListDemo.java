package ArryListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryListDemo {

	public static void main(String[] args) {

		// Deceleration
		ArrayList mylist = new ArrayList();

		mylist.add("wlecome");
		mylist.add('A');
		mylist.add(10.4);
		mylist.add(1000);
		mylist.add(1000);
		mylist.add(true);
		mylist.add(null);

		// ize of arraylist
		System.out.println("size of array list:" + mylist.size());

		// printing arraylist
		System.out.println("printing arraylist:" + mylist);

		// Remove arraylist
		System.out.println("Removed Elements:" + mylist.remove(5));
		mylist.remove(5);
		System.out.println("printing arraylist:" + mylist);

		// Insert the elements in arraylist
		mylist.add(2, 'C');
		System.out.println("printing arraylist:" + mylist);

		// Modify elements in the arraylist (modify/replace/change)
		mylist.set(2, 'D');
		System.out.println("printing arraylist:" + mylist);

		System.out.println("printing arraylist:" + mylist.get(2));

		// Reading all the elements from arraylist

		// using for loop
		for (int i = 0; i <= mylist.size() - 1; i++) {
			System.out.println(mylist.get(i));
		}

		// For Each loop

		for (Object x : mylist) {
			System.out.println(x);
		}

		// using iterate

		Iterator<Object> it = mylist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("Is ArrayList Empty:"+mylist.isEmpty());
		
		
		ArrayList mylist2 = new ArrayList();
		mylist2.add(1000);
		mylist2.add('A');
		mylist.removeAll(mylist2);
		
		System.out.println(mylist);
		
		mylist.clear();
		System.out.println(mylist);

		
	}

}
