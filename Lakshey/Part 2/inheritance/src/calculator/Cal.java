package calculator;

public class Cal extends Number {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println("Num 1 : "+c.n1);
		System.out.println("Num 2 : "+c.n2);
		System.out.println();
		System.out.println("Summation : "+c.sum());
		System.out.println("Subtraction : "+c.sub());
		System.out.println("Multiplication : "+c.mul());
	}
	int sum() {
	return this.n1+this.n2;
	}
    int sub() {
    	return this.n1-this.n2;	
	}
    int mul() {
    	return this.n1*this.n2;
    }
}