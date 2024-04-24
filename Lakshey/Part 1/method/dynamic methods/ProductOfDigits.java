class ProductOfDigits
{
  public static void main(String[] args)
  {
    int a = 23;
    System.out.println("the product of digits of "+a+" is "+digit(a));
  }
  public static int digit(int num1)
  {
   int b=1;
   while(num1>0)
   {
    b=product(b,num1%10);
    num1/=10;    
   }
   return b;
  }
  public static int product(int a,int b)
  {
    int product = a*b;
    return product;
  }
}