class Factors
{
  public static void main(String[] args)
  {
    int a = 6;
    factor(a);
    int b = 9;
    factor(b);
  }
  public static void factor(int num1)
  {
    int sum=0;
    for(int i=1;i<=num1;i++)
    {
      if(num1%i==0)
      {
        System.out.println("the factor of "+num1+" is "+i); 
      }
    }
  }
}