class Fabonicci 
{
  public static void main(String[] args) 
  {
    int last=0,current=0,temp=0;
    while (current>=0) {
        temp=current;
        System.out.print(current+", ");
        if (current==0) {
           current++;                                                                                                                                                                                                                                                                                                                                                                                                                  
        }else if (current==1 && last==0) 
        {
          last=1;                                                                                                                                                                                                                                                                                                                                                                                                                            
        }
        else
       {
         current+=last;
         last=temp;
       }
  }                                                                                                                                                                                                                                                                                                                                                                                                                                      
}
}
