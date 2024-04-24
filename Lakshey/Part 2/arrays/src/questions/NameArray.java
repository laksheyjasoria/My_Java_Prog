package questions;

public class NameArray {

	public static void main(String[] args) {
		String name[] = new String[10];
		name[0]="Lucky";
		name[1]="Lakshey";
		name[2]="Manjulika";
		name[3]="Kapil";
		name[4]="Nikku";
		name[5]="Nikki";
		name[6]="Pushpa";
		name[7]="Pritee";
		name[8]="Manoj";
		name[9]="Sonu";
		System.out.println("The reference of the arary : "+name);
		System.out.println("The length of the array : "+name.length);
		for (int i = 0; i < name.length; i++) {
		  System.out.println(name[i]);
			
		}
		System.out.println();
		int j=0;
		while(j<name.length) {
			System.out.println(name[j]);
			j++;
		}
		System.out.println();
		int k=0;
		do {
			System.out.println(name[k]);
			k++;
		} while (k<name.length);
	
		System.out.println("Baackward Tracing");
		for (int i =name.length-1; i >=0; i--) {
			  System.out.println(name[i]);
				
			}

	}
}
