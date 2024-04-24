class PrintDigits
{
  public static void main(String[] args)
  {
    int a = 6999;
    digit(a);
  }
  public static void digit(int num1)
  {
   int b;
   while(num1>0)
   {
    b=num1%10;
    System.out.println(b);
    num1/=10;    
   }

  }
}