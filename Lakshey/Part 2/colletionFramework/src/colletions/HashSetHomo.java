package colletions;

import java.util.HashSet;

public class HashSetHomo {

	public static void main(String[] args) {
		HashSet<Short> hs= new HashSet();
		hs.add((short)65);
		hs.add((short)5);
		hs.add((short)5);
		hs.add((short)0);
		hs.add((short) 7);
		hs.add((short) 854);
		hs.add((short) 5);
		System.out.println(hs);
		for (Short short1 : hs) {
			System.out.println(short1);
		}
	}
}
