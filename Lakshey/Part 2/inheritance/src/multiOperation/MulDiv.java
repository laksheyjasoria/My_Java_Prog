package multiOperation;

public class MulDiv extends AddSubCal {

	public static void main(String[] args) {
		MulDiv mDiv =new MulDiv();
		System.out.println("Multiplication : "+mDiv.mul());
		System.out.println("Division : "+mDiv.div());
	}
	int mul() {
		return this.num1*this.num2;
	}
    int div() {
    	return this.num1/this.num2;
	}
}
