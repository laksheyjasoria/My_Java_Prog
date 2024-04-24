package questions;

public class RollArray {

	public static void main(String[] args) {
		int roll[] = new int[7];
		roll[0]=89;
		roll[1]=67;
		roll[2]=87;
		roll[3]=92;
		roll[4]=46;
		roll[5]=48;
		roll[6]=44;
		System.out.println("The reference of the arary : "+roll);
		System.out.println("The length of the array : "+roll.length);
		for (int i = 0; i < roll.length; i++) {
		  System.out.println(roll[i]);
			
		}
		System.out.println();
		int j=0;
		while(j<roll.length) {
			System.out.println(roll[j]);
			j++;
		}
		System.out.println();
		int k=0;
		do {
			System.out.println(roll[k]);
			k++;
		} while (k<roll.length);
	
		System.out.println("Baackward Tracing");
		for (int i =roll.length-1; i >=0; i--) {
			  System.out.println(roll[i]);
				
			}
	}
}
