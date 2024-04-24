package questions;

public class GroupArray {

	public static void main(String[] args) {
		char group[] = new char[8];
		group[0]='a';
	    group[1]='b';
		group[2]='c';
		group[3]='d';
		group[4]='e';
		group[5]='f';
		group[6]='g';
		group[7]='h';
	
		System.out.println("The reference of the arary : "+group);
		System.out.println("The length of the array : "+group.length);
		for (int i = 0; i < group.length; i++) {
		  System.out.println(group[i]);
			
		}
		System.out.println();
		int j=0;
		while(j<group.length) {
			System.out.println(group[j]);
			j++;
		}
		System.out.println();
		int k=0;
		do {
			System.out.println(group[k]);
			k++;
		} while (k<group.length);
	
		System.out.println("Baackward Tracing");
		for (int i =group.length-1; i >=0; i--) {
			  System.out.println(group[i]);
				
			}

	}
}
