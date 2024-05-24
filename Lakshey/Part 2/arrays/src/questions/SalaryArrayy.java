package questions;

public class SalaryArrayy {

	public static void main(String[] args) {
		double salary[] = new double[5];
		salary[0]=77.5;
	    salary[1]=55.9;
		salary[2]=97;
		salary[3]=53.3;
		salary[4]=90.1;
	
		System.out.println("The reference of the arary : "+salary);
		System.out.println("The length of the array : "+salary.length);
		for (int i = 0; i < salary.length; i++) {
		  System.out.println(salary[i]);
			
		}
		System.out.println();
		int j=0;
		while(j<salary.length) {
			System.out.println(salary[j]);
			j++;
		}
		System.out.println();
		int k=0;
		do {
			System.out.println(salary[k]);
			k++;
		} while (k<salary.length);
	
		System.out.println("Baackward Tracing");
		for (int i =salary.length-1; i >=0; i--) {
			  System.out.println(salary[i]);
				
			}

	}
}
