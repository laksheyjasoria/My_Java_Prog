package colletions;

import java.util.Vector;

public class VectorHetro {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add('a');
		v.add("Hello");
		v.add(true);
		v.add(false);
		v.add(6);
		v.add(5.6);
		System.out.println(v);
		for (Object ob : v) {
			System.out.println(ob);
		}
	}
}
