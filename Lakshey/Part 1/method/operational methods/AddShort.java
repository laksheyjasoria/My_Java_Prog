class AddShort
{
  public static void main(String[] args)
  {
    short a = 2;
    short b = 3;
    int d = addShort(a,b);
    System.out.println("The sum of "+a+" & "+b+" is "+d);
  }
  public static int addShort(short num1, short num2)
  {
    int sum = num1 + num2;
    return sum;
  }
}