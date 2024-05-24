package questions;

public class EmpIdArray {

	public static void main(String[] args) {
		int emp[] = new int[4];
		emp[0]=77;
		emp[1]=55;
		emp[2]=97;
		emp[3]=53;
	
		System.out.println("The reference of the arary : "+emp);
		System.out.println("The length of the array : "+emp.length);
		for (int i = 0; i < emp.length; i++) {
		  System.out.println(emp[i]);
			
		}
		System.out.println();
		int j=0;
		while(j<emp.length) {
			System.out.println(emp[j]);
			j++;
		}
		System.out.println();
		int k=0;
		do {
			System.out.println(emp[k]);
			k++;
		} while (k<emp.length);
	
		System.out.println("Baackward Tracing");
		for (int i =emp.length-1; i >=0; i--) {
			  System.out.println(emp[i]);
				
			}

	}
}
