class AddIntFloat
{
  public static void main(String[] args)
  {
    float a = 2.5f;
    float b = 3.5f;
    int c = 4;
    float d = add2Float1Int(a,b,c);
    System.out.println("The sum of "+a+" & "+b+" & "+c+" is "+d);
  }
  public static float add2Float1Int(float num1, float num2, int num3)
  {
    float sum = num1 + num2 + num3;
    return sum;
  }
}