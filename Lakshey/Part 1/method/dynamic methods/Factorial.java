class Factorial
{
  public static void main(String[] args)
  {
    int a = 10;
    int c = factorial(a);
    System.out.println("The factorial of  "+a+" is "+c);
  }
  public static int factorial(int num1)
  {
    int sum=1;
    for(int i=num1;i>=1;i--)
    {
        sum*=i;     
    }
    return sum;
  }
}