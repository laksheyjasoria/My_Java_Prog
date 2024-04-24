class Pattern10
{
  public static void main(String [] args)
  {

   int k=1;
   int i=1;
   do
   {
    int j=1;
    do
    {
     System.out.print(k);
      k++;
      j++;
    }while(j<=3);
   System.out.println();
   i++;
   }while(i<=3);

   /*
   int k=1;
   int i=1;
   while(i<=3)
   {
    int j=1;
    while(j<=3)
    {
     System.out.print(k);
      k++;
      j++;
    }
   System.out.println();
   i++;
   }*/

   /* 
   int k=1;
   for(int i=1;i<=3;i++)
   {
    for(int j=1;j<=3;j++)
    {
      System.out.print(k);
      k++;
    }
    System.out.println();
   } */  
  }
}