class NoOfDigits
{
  public static void main(String[] args)
  {
    int a = 244;
    System.out.println("the number of digits of "+a+" is "+numOfDigit(a));
  }
  public static int numOfDigit(int num1)
  {
   int count=0;
   while(num1>0)
   {
    num1/=10;    
    count++;
   }
   return count;
  }
}