class DoubleNarrowing
{
  public static void main(String [] args)
  {
    double d = 70;
    float f = (float) d;
    long l = (long) d;
    int i = (int) d;
    short s = (short) d;
    byte b = (byte) d;
    char c = (char) d;
    System.out.println(b);
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
    System.out.print(c);
  }
}