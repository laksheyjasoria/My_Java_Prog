class ProductOfFactor
{
  public static void main(String[] args)
  {
    int a = 6;
    int c = factor(a);
    System.out.println("The product of factors of  "+a+" is "+c);
    int b = 12;
    int d = factor(b);
    System.out.println("The product of factors of  "+b+" is "+d);
  }
  public static int factor(int num1)
  {
    int sum=1;
    for(int i=1;i<=num1;i++)
    {
      if(num1%i==0)
      {
        sum*=i; 
      }
    }
    return sum;
  }
}