package multiOperation;

public class Average extends Data {

	public static void main(String[] args) {
		Average avg = new Average();
		System.out.println("Average : "+avg.average());
	}
	int average() {
		int sum = this.num1+this.num2;
		return sum/2;
	}
}