class Bro
{
  public static void main(String []args)
  {
    printMany(3,2,4,5,'a',"hello Buddy");
    System.out.println("main method");
  }
  public static void printMany(int c,long b,float a,double d,char e,String s)
  {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(s);
  }
}