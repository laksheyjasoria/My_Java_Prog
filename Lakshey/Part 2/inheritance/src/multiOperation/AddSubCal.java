package multiOperation;

public class AddSubCal extends Data{

	public static void main(String[] args) {
		AddSubCal as = new AddSubCal();
		System.out.println("Sum : "+as.sum());
		System.out.println("Sub : "+as.sub());
	}
	int sum() {
		return this.num1+this.num2;
	}
    int sub() {
    	return this.num1-this.num2;
	}
}
