package sical;

public class SICalculator extends Customer {

	public static void main(String[] args) {
		SICalculator s=new SICalculator();
		System.out.println("Principal : ");
		System.out.println("Calculated SI : "+s.siCal());
	}
	public double siCal() {
		double result = (this.principal*this.rate*this.time)/100;
		return result;
	}
}
