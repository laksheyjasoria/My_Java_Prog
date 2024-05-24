package colletions;

import java.util.LinkedList;

public class LinkedHashSetHomo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(null);
		ll.add("Lucky");
		ll.add(67);
		ll.add(67);
		ll.add('g');
		ll.add(89.8);
		ll.add("Kumar");
		System.out.println(ll);
	for (Object  ob : ll) {
		System.out.println(ob);
	}
	}
}
