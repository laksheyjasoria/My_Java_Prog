package collect;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		System.out.println(a.add(50));
		a.add(90.6);
		a.add(1, 'a');
		a.add("Jasoria is OP");
		System.out.print(a);
		System.out.println(a.remove(0));
		char c='a';
		System.out.println(a.indexOf('a'));
		System.out.println(a);
	}
}
