class PalindromeNumber
{
  public static void main(String[] args)
  {
   int a =121212;
   System.out.println(isPalin(a));
  }
  public static int counts(int num)
  {
   int count =0;
   while(num>0)
   {
     num/=10;
     count++;
   }
   return count;
  }
  public static String isPalin(int num)
  {
   int check = num;
   int r=0;
   int sum=0;
   int count = counts(num);
    while(num>0)
    {
     //r=num%10;
     sum+=num%10*power(count-1);
     count--;
     num/=10;
    }
    if(check==sum)
    {
     return "the number "+check+" is a Palindrome number"; 
    }else
     {
       return "the number "+check+" is not a Palindrome number";    
     }
  }
  public static int power(int num)
  {
   int res=1;
   for(int i=1;i<=num;i++)
   {
     res*=10;
   }
   return res;
  }
}