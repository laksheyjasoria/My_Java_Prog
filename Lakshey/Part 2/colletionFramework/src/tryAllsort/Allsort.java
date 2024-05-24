package tryAllsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Allsort {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		LinkedList<Integer> llist  = new LinkedList<Integer>();
		Vector<Integer> v = new Vector<Integer>();
		
		alist.add(30);
		alist.add(99);
		alist.add(12);
		alist.add(3);
		alist.add(89);
		alist.add(30);
		alist.add(75);
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);
		System.out.println("===================");
		
		llist.add(30);
		llist.add(99);
		llist.add(12);
		llist.add(3);
		llist.add(89);
		llist.add(30);
		llist.add(75);
		System.out.println(llist);
		Collections.sort(llist);
		System.out.println(llist);
		System.out.println("===================");
		
		v.add(30);
		v.add(99);
		v.add(12);
		v.add(3);
		v.add(89);
		v.add(30);
		v.add(75);
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
		System.out.println("===================");
		
//		HashSet<Integer> hs = new HashSet<Integer>();
//		hs.add(30);
//		hs.add(99);
//		hs.add(12);
//		hs.add(3);
//		hs.add(89);
//		hs.add(30);
//		hs.add(75);
//		System.out.println(hs);
//		Collections.sort(hs);
//		System.out.println(hs);
//		System.out.println("===================");
//		
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
//		lhs.add(30);
//		lhs.add(99);
//		lhs.add(12);
//		lhs.add(3);
//		lhs.add(89);
//		lhs.add(30);
//		lhs.add(75);
//		System.out.println(lhs);
//		Collections.sort(lhs);
//		System.out.println(lhs);
//		System.out.println("===================");
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(30);
		ts.add(99);
		ts.add(12);
		ts.add(3);
		ts.add(89);
		ts.add(30);
		ts.add(75);
		System.out.println(ts);
		//Collections.sort(ts);
//		System.out.println(ts);
		System.out.println("===================");
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Heelo");
//		al.add("Lucky");
//		al.add("Nikku");
//		al.add("Monu");
//		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
	}
}
