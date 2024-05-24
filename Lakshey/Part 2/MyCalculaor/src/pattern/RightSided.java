package pattern;

public class RightSided {

	 public static void pattern(int num)
	  {
	   for(int i=0;i<=num;i++)
	   {
	     for(int j=0;j<num-i;j++)
	     {
	        System.out.print(" ");
	      }
	     for(int j=0;j<i;j++)
	     {
	        System.out.print("*");
	      }
	    System.out.println();
	   }
	  }

}
