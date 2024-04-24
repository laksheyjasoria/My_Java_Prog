class SwapNum 
{
  public static void main(String[] args) 
  {
   int a=1,b=2,c=3;
   System.out.println("a: "+a+" b: "+b+" c: "+c);   
  System.out.println("After Swapping");
  a=a+b+c;
  b= a-(b+c);
  c= a-(b+c);
  a= a-(b+c);        
  System.out.println("a: "+a+" b: "+b+" c: "+c);                                                                                                                                                                                                                                                                                                                                                                                                                      
}
}