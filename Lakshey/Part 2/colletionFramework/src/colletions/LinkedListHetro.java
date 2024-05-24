package colletions;

import java.util.LinkedList;

import javax.security.auth.callback.LanguageCallback;

public class LinkedListHetro {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
	    linkedList.add("Hello");
	    linkedList.add("World");
	    linkedList.add(null);
	    linkedList.add(null);
	    linkedList.add("Hello");
	    linkedList.add(true);
	    linkedList.add(5.7);
	    System.out.println(linkedList);
	    for (Object ll : linkedList) {
			System.out.println(ll);
		}
	}
}
