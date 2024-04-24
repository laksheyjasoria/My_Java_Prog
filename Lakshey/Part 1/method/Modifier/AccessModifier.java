class AccessModifier
{
 
  public static void main(String[] args)
  {
    m1();
    m2();
    m3();
    m4();
  }
  public static void m1()
  {
    System.out.println("public");
  }
  protected static void m2()
  {
    System.out.println("protected");
  }
  static void m3()
  {
    System.out.println("default");
  }
  private static void m4()
  {
    System.out.println("private");
  }
  public void m5()
  {
    System.out.println("non-static public");
  } 

}