class CharCheck
{
  public static void main(String [] args)
  {
    char c='s';
    
     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
     {
       System.out.println("Character is vowel");
     }
     else if(c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='m'||c=='n'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='v'||c=='x'||c=='w'||c=='y'||c=='z')
     {
       System.out.println("Character is consonant");
     }
     else
     {
       System.out.println("Character is not a alphabet");
     }
      
    
  }
}