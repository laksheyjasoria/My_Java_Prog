class DivTwoInt
{
  public static void main(String[] args)
  {
    int a = 10;
    int b = 5;
    int c = divIntNum(a,b);
    System.out.println("The division of "+a+" & "+b+" is "+c);
    int e = 15;
    int f = 2;
    int g = divIntNum(e,f);
    System.out.println("The division of "+e+" & "+f+" is "+g);
  }
  public static int divIntNum(int num1, int num2)
  {
    int sum = num1 / num2;
    return sum;
  }
}