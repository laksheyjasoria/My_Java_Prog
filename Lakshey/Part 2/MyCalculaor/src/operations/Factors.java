package operations;

public class Factors {

	public static void main(String[] args) {
		factor(6);
	}
	public static void factor(int num) {
		for (int i = 1; i <=num; i++) {
			if (num%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
