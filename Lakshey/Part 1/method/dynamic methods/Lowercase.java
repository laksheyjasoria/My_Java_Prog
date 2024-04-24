class Lowercase
{
  public static void main (String [] args)
  {
   char ch='a'; 
   System.out.println(lower(ch));
  }
  public static char lower(char c)
  {
    if(c>='a'||c<='z') 
    { 
     c=(char) (c-32);
    } 
   return c;
 }
}