class Power
{
  public static void main(String [] args)
  {
   int n=4,count=0;
   int n1=2;
   int n2=n;
   while(n2>=1){
    n2/=n1;
    count++;
   }
   System.out.println("The Power of number "+n+" w.r.t "+n1+" is "+(count-1));
  }
}