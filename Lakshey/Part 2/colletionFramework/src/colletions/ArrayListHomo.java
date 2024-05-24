package colletions;

import java.util.ArrayList;

public class ArrayListHomo {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList();
	   a.add(5);	
	   a.add(45);	
	   a.add(32);	
	   a.add(654);	
	   a.add(87);	
	   a.add(52);	
	   a.add(1);	
	   System.out.println(a);
	   for (Integer i : a) {
		System.out.println(i);
	}
	}
}
