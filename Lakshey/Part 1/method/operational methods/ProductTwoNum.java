class ProductTwoNum
{
  public static void main(String[] args)
  {
    int a = 2;
    int b = 3;
    int c = product(a,b);
    System.out.println("The product of "+a+" & "+b+" is "+c);
  }
  public static int product(int num1, int num2)
  {
    int product = num1 * num2;
    return product;
  }
}