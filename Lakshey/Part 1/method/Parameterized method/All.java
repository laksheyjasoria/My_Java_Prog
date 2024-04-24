class All
{
  public static void main(String  [] args)
  {
    System.out.println("Main Method");
    printInt(5);
    printFloat(4,5.6f);
    printMany(false,5.9f,4);
    printMany2(4,2,5.6f,7.7);
    printMany3(9,87879879,5.6f,8,'A',"hey");
  }
  public static void printInt(int a)
  {
    System.out.println(a);
  }
  public static void printFloat(int b,float a)
  {
    System.out.println(a);
    System.out.println(b);
  }
  public static void printMany(boolean b,float a,double d)
  {
    System.out.println(b);
    System.out.println(a);
    System.out.println(d);
  }
  public static void printMany2(int c,int b,float a,double d)
  {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
  public static void printMany3(int c,long b,float a,double d,char e,String s)
  {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(s);
  }
}