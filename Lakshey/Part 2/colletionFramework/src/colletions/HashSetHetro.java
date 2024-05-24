package colletions;

import java.util.HashSet;

public class HashSetHetro {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add(65);
		hs.add(5.7);
		hs.add("Hello");
		hs.add('r');
		hs.add("Hy");
		hs.add(99);
//		hs.add(" ");
		System.out.println(hs);
		for (Object ob : hs) {
			System.out.println(hs);
		}
	}
}
