class CharCheck
{
  public static void main(String [] args)
  {
    char c='9';
    switch(c)
    {
     case 'a','e','i','o','u':
     {
       System.out.println("Character is vowel");
     }
     break;
     case 'b','c','d','f','g','h','j','k','m','n','p','q','r','s','t','v','x','w','y','z':
     {
       System.out.println("Character is consonant");
     }
     break;  
     default :
     {
       System.out.println("Character is not a alphabet");
     }
     break; 
    }
  }
}