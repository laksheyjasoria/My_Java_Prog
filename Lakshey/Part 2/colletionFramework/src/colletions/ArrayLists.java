package colletions;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList i = new ArrayList();
		i.add("hy");
		i.add("45");
		i.add('a');
		i.add(5);
		i.add(5.6);
		i.add(true);
		i.add(false);
		i.add(null);
		i.add(null);
		
		System.out.println(i);
		for (Object a : i) {
			System.out.println(a);
		}
		
	}
}
