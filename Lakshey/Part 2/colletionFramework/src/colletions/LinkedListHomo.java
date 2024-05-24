package colletions;

import java.util.LinkedList;

public class LinkedListHomo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList();
		ll.add(null);
		ll.add("Lucky");
		ll.add("Lucky");
		ll.add(null);
		ll.add("Lakshey");
		ll.add("Kumar");
		System.out.println(ll);
	for (String string : ll) {
		System.out.println(string);
	}
	}
}
