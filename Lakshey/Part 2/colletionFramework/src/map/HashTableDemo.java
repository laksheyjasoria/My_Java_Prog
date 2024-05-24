package map;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, Object> ht = new Hashtable<Integer, Object>();
		ht.put(6, "Pulkit");
		ht.put(8, 57);
		ht.put(9, 6.7);
		ht.put(11, 6.7);
		
		System.out.println(ht.contains(57));
		System.out.println(ht.containsKey(10));
		System.out.println(ht.containsValue(57));
		System.out.println(ht.get(10));
		System.out.println(ht.remove(9));
		System.out.println(ht);
		System.out.println(ht.remove(7,"Pulkit"));
//		System.out.println(ht.get(9));
	}
}
