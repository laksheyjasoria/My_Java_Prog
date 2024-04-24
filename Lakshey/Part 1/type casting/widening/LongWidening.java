class LongWidening
{
  public static void main(String [] args)
  {
    long l = 89;
    float f = l;
    double d = l;
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
  }
}