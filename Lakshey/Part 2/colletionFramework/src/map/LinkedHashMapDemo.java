package map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
	LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
	lhm.put(1, "Bachi");
	lhm.put(3, "Monu");
	lhm.put(6, "Neetu");
	System.out.println(lhm);
	System.out.println(lhm.isEmpty());
	}
}
