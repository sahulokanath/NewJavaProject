package ArryListDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map hm = new HashMap();

		HashMap hm1 = new HashMap();

		HashMap<String, Integer> hm2 = new <String, Integer>HashMap();

		hm2.put("lock", 8900);
		hm2.put("Ram", 1000);
		hm2.put("raju", 92923);
		hm2.put("sdj", 32232);
		hm2.put("lock", 8900);

		System.out.println(hm2.size());

		System.out.println(hm2);

		hm2.remove(1000);
		System.out.println(hm2);

		System.out.println(hm2.keySet());
		System.out.println(hm2.values());
		System.out.println(hm2.entrySet());

		for (String k : hm2.keySet()) {
			System.out.println(k + hm2.get(k));
		}

		Iterator<Entry<String, Integer>> it = hm2.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String,Integer> entry = it.next();
			
			System.out.println(entry.getKey()+ entry.getKey());
		}

	}

}
