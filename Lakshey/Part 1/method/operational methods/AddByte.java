class AddByte
{
  public static void main(String[] args)
  {
    byte a = 2;
    byte b = 3;
    int d = addByte(a,b);
    System.out.println("The sum of "+a+" & "+b+" is "+d);
  }
  public static int addByte(byte num1, byte num2)
  {
    int sum = num1 + num2;
    return sum;
  }
}