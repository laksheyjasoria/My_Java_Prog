package questions;

public class PhoneArray {

	public static void main(String[] args) {
		long phno[] = new long[3];
		phno[0]=7206169908l;
		phno[1]=9123414725l;
		phno[2]=9992904410l;
	
		System.out.println("The reference of the arary : "+phno);
		System.out.println("The length of the array : "+phno.length);
		for (int i = 0; i < phno.length; i++) {
		  System.out.println(phno[i]);
			
		}
		System.out.println();
		int j=0;
		while(j<phno.length) {
			System.out.println(phno[j]);
			j++;
		}
		System.out.println();
		int k=0;
		do {
			System.out.println(phno[k]);
			k++;
		} while (k<phno.length);
	
		System.out.println("Baackward Tracing");
		for (int i =phno.length-1; i >=0; i--) {
			  System.out.println(phno[i]);
				
			}

	}
}
