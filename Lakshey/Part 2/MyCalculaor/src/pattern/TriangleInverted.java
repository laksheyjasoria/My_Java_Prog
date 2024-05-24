package pattern;

public class TriangleInverted {

	public static void pattern(int num)
	  {
	   for(int i=num;i>=0;i--)
	   {
	     for(int j=num-i;j>=0;j--)
	     {
	        System.out.print(" ");
	      }
	     for(int j=i;j>0;j--)
	     {
	        System.out.print("* ");
	      }
	    System.out.println();
	   }
	  }
}
