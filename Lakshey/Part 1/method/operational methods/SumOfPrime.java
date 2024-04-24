class SumOfPrime
{
  public static void main(String[] args)
  {
    int a = 1;
    int b = 20;
    int c = sumOfPrime(a,b);
    System.out.println("The sum of prime numbers between "+a+" & "+b+" is "+c);
  }
  public static int sumOfPrime(int num1, int num2)
  {
    int sum=0;
    for(int i=num1;i<=num2;i++)
    {
      if(isPrime(i))
      {
       sum+=i;
      }
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