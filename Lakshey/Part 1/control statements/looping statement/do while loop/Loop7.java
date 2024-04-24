class Loop7
{
  public static void main(String [] args)
  {
    int i = 65;
    char c;
    do
    {
      c = (char)i;
      System.out.println(i);
      System.out.println(c);
      i++;
    }while(true);
  }
}