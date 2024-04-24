class ModifierEx1
{
  static int a=9;
  public static void main(String[] args)
  {
    //int a=9;
    int b=8;
    ModifierEx1 obj = new ModifierEx1();
    System.out.println("the value of a is "+a);
    System.out.println("the value of b is "+b);
    a++;
    System.out.println("the value of a is "+ModifierEx1.a);
    System.out.println("the value of b is "+b);
    b++;
    System.out.println("the value of a is "+obj.a);
    System.out.println("the value of b is "+b);

  }
   

}