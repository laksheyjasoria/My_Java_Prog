package map;

import java.util.HashMap;

public class HashMapEx2 {

	public static void main(String[] args) {
		

		HashMap<Integer, String> indmap = new HashMap<Integer, String>();
		indmap.put(4, "Lucky");
		indmap.put(8, "Nikku");
		System.out.println(indmap);
		indmap.put(8, "Nikki");
		System.out.println(indmap);
	}
	
}