package map;

import java.util.HashMap;

public class HashMapHomo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> indmap = new HashMap<Integer, String>();
		indmap.put(7, "Dhoni");
		indmap.put(4, "Sharma ji");
		indmap.put(8, "Nikku");
		
		HashMap<Integer, String> ausmap = new HashMap<Integer, String>();
		ausmap.put(1, "Smith");
		ausmap.put(2, "Warner");
		ausmap.put(3, "MAxwell");

		HashMap<Integer, String> allmap = new HashMap<Integer, String>();
		allmap.putAll(indmap);
		allmap.putAll(ausmap);
		System.out.println(allmap.size());
		System.out.println(allmap.isEmpty());
		System.out.println(allmap.remove(2));
		System.out.println(allmap.containsValue("Warner"));
		System.out.println(allmap.containsKey(1));
		System.out.println(allmap.get(7));
		System.out.println(allmap.size());
	}
}
