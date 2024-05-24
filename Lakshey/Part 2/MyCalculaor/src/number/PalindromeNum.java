package number;
import operations.*;
public class PalindromeNum {

	 public static void main(String[] args)
	  {
	   int a =121;
	   System.out.println(isPalin(a));
	  }
	 public static String isPalin(int num)
	  {
	   int check = num;
	   int sum=0;
	   DigitCount dgCount = new DigitCount();
	   int count =  dgCount.countDig(num);
	    while(num>0)
	    {
	     //r=num%10;
	     sum+=num%10*Power.power(10, count-1);
	     count--;
	     num/=10;
	    }
	    if(check==sum)
	    {
	     return "The number "+check+" is a Palindrome number"; 
	    }else
	     {
	       return "The number "+check+" is not a Palindrome number";    
	     }
	  }
}
//class PalindromeNumber
//{
// 
//  public static int counts(int num)
//  {
//   int count =0;
//   while(num>0)
//   {
//     num/=10;
//     count++;
//   }
//   return count;
//  }
//  
//  public static int power(int num)
//  {
//   int res=1;
//   for(int i=1;i<=num;i++)
//   {
//     res*=10;
//   }
//   return res;
//  }
//}