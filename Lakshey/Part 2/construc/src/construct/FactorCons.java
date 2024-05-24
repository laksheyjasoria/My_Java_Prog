package construct;

public class FactorCons {

	public FactorCons(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Factors of "+a+" are ");
		for (int i = 1; i <= a; i++) {
			if (a%i==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		FactorCons  aCons =  new FactorCons(6);
		System.out.print("reference address of object is : ");
		System.out.println(aCons);
	}
}
