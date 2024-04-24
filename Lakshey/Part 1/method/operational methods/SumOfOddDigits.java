class SumOfOddDigits
{
  public static void main(String[] args)
  {
    int a = 6994;
    System.out.println("the sum of all the digits of number "+a+" is "+sumOfODig(a));
  }
  public static int sumOfODig(int num1)
  {
   int b,sum;
   sum=0;
   while(num1>0)
   {
    b=num1%10;
    if(b%2!=0)
    {
    sum+=b;
    }
    num1/=10;    
   }
  return sum;
  }
}