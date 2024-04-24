class Pattern 
{
  public static void main(String[] args) 
  {
    patterns(5);                                                                                                                                                                                                                                                                                                                                                                                                                      
  }  
  public static void patterns( int num)
  {
    for (int i = 1; i <=num; i++) {

      for (int j = 1; j <= i; j++)   
      {
        System.out.print(" ");
      }  
      for (int k = 1; k <=num+1-i ; k++) {
       System.out.print("* ");                                                                                                                                                                                                                                                                                                                                                                                                                    
      }    
      System.out.println();                                                                                                                                                                                                                                                                                                                                                                                                                     
    }
  }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
}
