package division;

public class Division {

	public static void main(String[] args) {
		int c=division(4, 0);
		if (c==-1) {
			System.out.println("You give 0 in denominator that is not divisible");
		}else {
			System.out.println(division(4, 0));
		}
	 
	}
    public static int division(int numerator,int denominator) {
		if(denominator!=0)
		{
			return numerator/denominator;
		}else {
			return -1;
		}
	}
}
