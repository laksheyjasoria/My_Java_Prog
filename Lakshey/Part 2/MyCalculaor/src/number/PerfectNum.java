package number;

public class PerfectNum {

	public static void main(String[] args)
	  {
	   int a =6;
	   if(sumFactor(a))
	   {
	    System.out.println("The number "+a+" is perfect Number");
	   }else
	   {
	    System.out.println("The number "+a+" is not perfect Number"); 
	   }
	  }
	  public static boolean sumFactor(int num)
	  {
	    int sum=0,temp=num;
	    for(int i=1;i<num;i++)
	    {
	      if(num%i==0)
	      {
	        sum+=i;
	      }
	    }
	    if (temp==sum) {
			return true;
		} else {
            return false;
		}
	  }
}
