class SumOfPrimeDigits
{
  public static void main(String[] args)
  {
    int a = 6291;
    System.out.println("the sum of all the digits of number "+a+" is "+sumOfPDig(a));
  }
  public static int sumOfPDig(int num1)
  {
   int b,sum;
   sum=0;
   while(num1>0)
   {
    b=num1%10;
    if(isPrime(b))
    {
    sum+=b;
    }
    num1/=10;    
   }
  return sum;
  }

public static boolean isPrime(int a)
  {
   for(int i=2;i<a;i++)
   {
     if(a%i==0)
     {
      return false;
     }
   }
   return true; 
  }
}
