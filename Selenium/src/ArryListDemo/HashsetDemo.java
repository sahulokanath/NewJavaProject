package ArryListDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {

		HashSet myset = new HashSet();
		
		myset.add("welcome");
		myset.add(100);
		myset.add(100);
		myset.add('A');
		myset.add(true);
		
		System.out.println(myset);
		
		myset.remove('A');
		
		System.out.println(myset);
		System.out.println(myset.size());
		
		ArrayList list = new ArrayList(myset);
		System.out.println(3);
		
		
		//read the data using for each loop
		
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		Iterator it =myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		myset.clear();
		
		System.out.println(myset);
		
	}

}
