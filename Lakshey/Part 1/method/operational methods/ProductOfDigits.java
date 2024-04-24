class ProductOfDigits
{
  public static void main(String[] args)
  {
    int a = 12345;
    System.out.println("the sum of all the digits of number "+a+" is "+productOfDig(a));
  }
  public static int productOfDig(int num1)
  {
   int b,sum;
   sum=1;
   while(num1>0)
   {
    b=num1%10;
    sum*=b;
    num1/=10;    
   }
  return sum;
  }
}