class SumOfEven
{
  public static void main(String[] args)
  {
    int a = 1;
    int b = 20;
    int c = sumOfEven(a,b);
    System.out.println("The sum of even numbers between "+a+" & "+b+" is "+c);
  }
  public static int sumOfEven(int num1, int num2)
  {
    int sum=0;
    for(int i=num1;i<=num2;i++)
    {
      if(i%2==0)
      {
        sum+=i; 
      }
    }
    return sum;
  }
}