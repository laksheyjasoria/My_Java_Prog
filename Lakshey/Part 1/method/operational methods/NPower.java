class NPower
{
  public static void main(String [] args)
  { 
   int a = 3; 
   int b = 6;
   System.out.println("The "+b+"th power of "+a+" is "+pow(a,b));
  }
  public static int pow(int a,int b)
  { 
   int value=1;
   for(int i=1;i<=b;i++)
   {
    value *=a;
   }
   return value;
  }
}