package operations;

public class DigitCount {

	public static void main(String[] args) {
		
		DigitCount c = new DigitCount();
		System.out.println(c.countDig(1234));
	}
	public int countDig(int num) {
		int count =0;
		while (num>0) {
		 num/=10;
		 count++;
		}
		return count;
	}
}
