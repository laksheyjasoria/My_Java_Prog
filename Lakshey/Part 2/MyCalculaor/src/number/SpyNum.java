package number;

public class SpyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(spy(132));
	}
	public static boolean spy(int num)
	  {
	   int sum=0;
	   int pro =1;
	   while(num>0)
	   {
	    sum +=num%10;
	    pro*=num%10;
	    num/=10;
	   } 
	   if(sum==pro)
	   {
	     return true;
	   }else
	   {
	      return false;
	   }
	  }

}
