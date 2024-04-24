class ModifierEx3
{
  int a=9;
  public static void main(String [] args)
  {
   ModifierEx3 obj1 = new ModifierEx3();
   obj1.mod();
  }
  public void mod()
  {
    //int a=9;
    int b=8;
    //ModifierEx3 obj = new ModifierEx3();
    System.out.println("the value of a is "+a);
    System.out.println("the value of b is "+b);
    a++;
    System.out.println("the value of a is "+a);
    System.out.println("the value of b is "+b);
    b++;
    System.out.println("the value of a is "+a);
    System.out.println("the value of b is "+b);

  }
   

}