class ModifierEx2
{
  int a=9;
  public static void main(String[] args)
  {
    //int a=9;
    int b=8;
    ModifierEx2 obj = new ModifierEx2();
    System.out.println("the value of a is "+obj.a);
    System.out.println("the value of b is "+b);
    obj.a++;
    System.out.println("the value of a is "+obj.a);
    System.out.println("the value of b is "+b);
    b++;
    System.out.println("the value of a is "+obj.a);
    System.out.println("the value of b is "+b);

  }
   

}