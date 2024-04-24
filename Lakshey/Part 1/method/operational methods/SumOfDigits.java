class SumOfDigits
{
  public static void main(String[] args)
  {
    int a = 6999;
    System.out.println("the sum of all the digits of number "+a+" is "+sumOfDig(a));
  }
  public static int sumOfDig(int num1)
  {
   int b,sum;
   sum=0;
   while(num1>0)
   {
    b=num1%10;
    sum+=b;
    num1/=10;    
   }
  return sum;
  }
}