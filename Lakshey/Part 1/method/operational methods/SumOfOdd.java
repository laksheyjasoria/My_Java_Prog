class SumOfOdd
{
  public static void main(String[] args)
  {
    int a = 20;
    int b = 30;
    int c = sumOfOdd(a,b);
    System.out.println("The sum of odd numbers between "+a+" & "+b+" is "+c);
  }
  public static int sumOfOdd(int num1, int num2)
  {
    int sum=0;
    for(int i=num1;i<=num2;i++)
    {
      if(i%2!=0)
      {
        sum+=i; 
      }
    }
    return sum;
  }
}