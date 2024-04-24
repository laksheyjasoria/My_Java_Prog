class Activity4
{
  public static void main(String [] args)
  {
    char c='8';
    int a = c;
    String s = (a>=48&&a<=57) ? "Digit" : "Not a Digit";
    System.out.println(s);
  }
}