class ExplicitWidening
{
  public static void main(String [] args)
  {
    byte b= 5;
    int a = (int) b;
    System.out.println(b);
    System.out.println(a);
  }
}