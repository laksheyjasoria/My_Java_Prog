class AddTwoFloat
{
  public static void main(String[] args)
  {
    float a = 2.5f;
    float b = 3.5f;
    float c = addFloatNum(a,b);
    System.out.println("The sum of "+a+" & "+b+" is "+c);
  }
  public static float addFloatNum(float num1, float num2)
  {
    float sum = num1 + num2;
    return sum;
  }
}