class Factorial
{
  public static void main(String [] args)
  {
   int n=4;
   int fact=1;
   for(int i=n;i>=1;i--)
   {
    fact*=i;
   }
   System.out.println("The factorial of "+n+" is "+fact);
  }
}