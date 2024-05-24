package multiOperation2;

public class SumSub extends Data {

	public static void main(String[] args) {
		
		SumSub ss = new SumSub();
		System.out.println("Sum : "+ss.sum());
		System.out.println("Sub : "+ss.sub());
	}
	int sum() {
		return this.n1+this.n2;
	}
    int sub() {
    	return this.n1-this.n2;
	}
}
