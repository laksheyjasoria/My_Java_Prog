package operations;

public class Power {
	public static void main(String[] args) {
     System.out.println(power(3, 3));
	}
    public static int power(int base,int power) {
		int square =1;
		for (int i = 1; i <=power ; i++) {
		 square *=base;	
		}
		return square;
	}
}
