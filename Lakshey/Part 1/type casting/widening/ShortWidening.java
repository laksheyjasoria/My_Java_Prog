class ShortWidening
{
  public static void main(String [] args)
  {
    short s = 6;
    int i = s;
    long l = s;
    float f = s;
    double d = s;
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
  }
}