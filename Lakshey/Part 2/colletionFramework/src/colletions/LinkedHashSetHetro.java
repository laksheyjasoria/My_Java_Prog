package colletions;

import java.util.LinkedHashSet;

public class LinkedHashSetHetro {

	public static void main(String[] args) {
		LinkedHashSet lhset = new LinkedHashSet();
		lhset.add("Hello");
		lhset.add('H');
		lhset.add(67);
		lhset.add(6.6);
		lhset.add(true);
		System.out.println(lhset);
		for (Object object : lhset) {
			System.out.println(object);
		}
	}
}
