package studentDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Driver2 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1, "aLaldfkdnucky", "lkjs@gm.com", 72061699, "dfkbsk");
		Student s2 = new Student(50, "Adfihbkb", "lkjs@gm.com", 72061699, "dfkbsk");
		Student s3 = new Student(6, "baodfnlkjs", "lkjs@gm.com", 72061699, "dfkbsk");
		Student s4 = new Student(8, "Baskjkkbpritee", "lkjs@gm.com", 72061699, "dfkbsk");
	
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
