class NumBetween
{
  public static void main(String [] args)
  {
   int n=9,m=9;
   int upper=0,lower=0,count=0;
   if(n>m)
   {
     upper=n;
     lower=m;
     for(int i=lower;i<=upper;i++)
     {
      count++;
     }
     System.out.println("There is "+count+" number present between "+n+" and "+m);
   }
   else if(n<m)
   {
     upper=m;
     lower=n;
     for(int i=lower;i<=upper;i++)
     {
       count++;
     }
     System.out.println("There is "+count+" number present between "+n+" and "+m);
   }
   else
   {
     System.out.println("There is no number present between "+n+" and "+m);
   }
   
  }
}