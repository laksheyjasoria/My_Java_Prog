package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx3 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "Pushpa");
		hm.put(2, "Fire");
		hm.put(7, "Flower");
		System.out.println("Iterating Map using KeySet");
		Set<Integer> s = hm.keySet();
//		for(Integer i : s) {
//			System.out.println("Key : "+i);
//		}
//		for(Integer i:s) {
//			System.out.println(hm.get(i));
//		}
		
		Collection<String> c= hm.values();
		
		for(String i:c) {
			if(i.charAt(i.length()-1)=='a'||i.charAt(i.length()-1)=='e'||i.charAt(i.length()-1)=='i'||i.charAt(i.length()-1)=='o'||i.charAt(i.length()-1)=='u')
			System.out.println(i);
		}
	}
}
