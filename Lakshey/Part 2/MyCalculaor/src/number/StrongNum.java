package number;
import operations.*;

public class StrongNum {

	public static void main(String[] args) {
	System.out.println(isStrong(142));
	}
	public static boolean isStrong(int num)
	  {
	   int check = num;
	   int sum=0;
	    while(num>0)
	    {
	     sum+= Factorial.fact(num%10);
	     num/=10;
	    }
	    if(check==sum)
	    {
	     return true; 
	    }else
	     {
	       return false;    
	     }
	  }

}
