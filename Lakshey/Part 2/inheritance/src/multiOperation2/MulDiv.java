package multiOperation2;

public class MulDiv extends Data{

public static void main(String[] args) {
		
		MulDiv ss = new MulDiv();
		System.out.println("Mul : "+ss.mul());
		System.out.println("Div : "+ss.div());
	}
	int mul() {
		return this.n1*this.n2;
	}
    int div() {
    	return this.n1/this.n2;
	}
}
