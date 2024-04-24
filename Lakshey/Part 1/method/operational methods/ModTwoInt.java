class ModTwoInt
{
  public static void main(String[] args)
  {
    int a = 10;
    int b = 5;
    int c = modIntNum(a,b);
    System.out.println("The modulus of "+a+" & "+b+" is "+c);
    int e = 15;
    int f = 2;
    int g = modIntNum(e,f);
    System.out.println("The modulus of "+e+" & "+f+" is "+g);
  }
  public static int modIntNum(int num1, int num2)
  {
    int sum = num1 % num2;
    return sum;
  }
}