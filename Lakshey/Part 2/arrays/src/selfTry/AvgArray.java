package selfTry;

public class AvgArray {

	public static float avg(int a []) {
		float result = (sum(a)/a.length);
		return result;
	}
	public static float sum(int a []) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+= a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int a [] = {1,2,3,4};
		System.out.println(avg(a));
	}
}
