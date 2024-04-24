class ByteWidening
{
  public static void main(String [] args)
  {
    byte b =9;
    short s = b;
    int i = b;
    long l = b;
    float f = b;
    double d = b;
    System.out.println(b);
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
  }
}