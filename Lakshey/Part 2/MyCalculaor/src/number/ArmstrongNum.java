package number;
import operations.*;
public class ArmstrongNum {

	public static void main(String[] args) {
//		System.out.println(armstrong());
		
	}
	public static String armstrong(int num) {
	    int sum=0;
	    int temp=num;
	    DigitCount c = new DigitCount();
	    int count = c.countDig(num);
	    while(num>0)
	    {
	      sum+=Power.power(num%10,count);
	      num/=10;
	    }
	    if(temp==sum)
	    {
	     return "The number "+temp+" is a Armstrong number"; 
	    }else
	     {
	       return "The number "+temp+" is not a Armstrong number";    
	     }
	  }

}
