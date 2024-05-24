package questions;

public class OpinionArray {

	public static void main(String[] args) {
		boolean opnion[] = new boolean[7];
		opnion[0]=true;
		opnion[1]=false;
		opnion[2]=true;
		opnion[3]=false;
		opnion[4]=false;
		opnion[5]=true;
		opnion[6]=false;
		System.out.println("The reference of the arary : "+opnion);
		System.out.println("The length of the array : "+opnion.length);
		for (int i = 0; i < opnion.length; i++) {
		  System.out.println(opnion[i]);
			
		}
		System.out.println();
		int j=0;
		while(j<opnion.length) {
			System.out.println(opnion[j]);
			j++;
		}
		System.out.println();
		int k=0;
		do {
			System.out.println(opnion[k]);
			k++;
		} while (k<opnion.length);
	
		System.out.println("Baackward Tracing");
		for (int i =opnion.length-1; i >=0; i--) {
			  System.out.println(opnion[i]);
				
			}
}
}
