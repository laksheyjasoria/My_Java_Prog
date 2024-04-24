class PrimeNumber
{
  public static void main(String[] args)
  {
   int a =50;
   if(isPrime(a))
   {
    System.out.println("The number "+a+" is prime Number");
   }else
   {
    System.out.println("The number "+a+" is not prime Number"); 
   }
  }
  public static boolean isPrime(int num)
  {
    for(int i=2;i<num;i++)
    {
      if(num%i==0)
      {
        return false;        
      }
    }
    return true;
  }
}