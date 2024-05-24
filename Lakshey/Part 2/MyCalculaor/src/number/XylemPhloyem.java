package number;

import operations.DigitCount;

public class XylemPhloyem {

	public static String xylemPhloem(int num)
	  {
	    //int check = num;
	    int r=0,outer_sum=0,inner_sum=0;
	    DigitCount dgCount = new DigitCount();
	    int count= dgCount.countDig(num);
	    int chk=count;
	    while(num>0)
	    {
	     r=num%10;
	     if(chk==count||chk==1)
	     {
	       outer_sum+=r;
	     }
	     else
	     {
	       inner_sum+=r;
	     }
	     num/=10;
	     chk--;
	    }
	    if(outer_sum==inner_sum)
	    {
	     return "Xylem";
	    }
	    else
	    {
	      return "Phloem";
	    }
	             
	  }

}
