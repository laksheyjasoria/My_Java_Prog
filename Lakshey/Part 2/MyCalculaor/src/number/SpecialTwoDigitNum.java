package number;
import operations.*;
public class SpecialTwoDigitNum {

	public static String twoDigit(int num)
	  {
	    int check = num;
	    int sum =0;
	    int pro =1;
	    DigitCount dgCount = new DigitCount();
	   if( dgCount.countDig(num)==2){
	    while(num>0)
	    {
	     sum+=num%10;
	     pro*=num%10;
	     num/=10;
	    }
	     if(check==(sum+pro))
	     {
	      return "The number "+check+" is special two digit number";
	     }
	     else
	     {
	      return "The number "+check+" is not a special two digit number";
	     }
	  }
	  else
	  {
	    return "The number "+check+" is not a two digit number";
	  }
	  }

}
