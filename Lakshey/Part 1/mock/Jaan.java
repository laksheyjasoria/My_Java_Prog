class Jaan
{
  public static void main(String[] args)
  {
    task(4);
  }
  public static void task(int num)
  {
    int sum=0,b=0;
     while(num>0)
     {
       b=num%10;
       for(int i =1;i<=b;i++)
       {
           if(b%i==0)
           {
             sum+=sq(fact(i));
           }
       }

       num/=10;
     }
       System.out.println(sum);
     
  }
  public static int fact(int num)
  {
     int facts=1;
    /*if(num>0)
    {
      return fact(num-1);
    }
    else
    {
     return 1;
    }*/
    for(int i=1;i<=num;i++)
    {
      facts*=i;
    }
    return facts;
  }
  public static int sq(int num) 
  {
    return num*num;
  }
  
}