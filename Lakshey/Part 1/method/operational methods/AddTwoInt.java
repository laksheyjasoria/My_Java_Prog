class AddTwoInt
{
  public static void main(String[] args)
  {
    int a = 2;
    int b = 3;
    int c = addIntNum(a,b);
    System.out.println("The sum of "+a+" & "+b+" is "+c);
  }
  public static int addIntNum(int num1, int num2)
  {
    int sum = num1 + num2;
    return sum;
  }
}