class SumOfEDigits
{
  public static void main(String[] args)
  {
    int a = 244;
    System.out.println("the product of digits of "+a+" is "+digit(a));
  }
  public static int digit(int num1)
  {
   int b=0,sum=0;
   while(num1>0)
   {
    b=num1%10;
    if(b%2==0)
    {
    sum=add(sum,b);
    }
    num1/=10;    
   }
   return sum;
  }
  public static int add(int a,int b)
  {
    int product = a+b;
    return product;
  }
}