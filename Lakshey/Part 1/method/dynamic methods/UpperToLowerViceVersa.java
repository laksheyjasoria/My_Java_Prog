class UpperToLowerViceVersa
{
	public static void main(String[] args)
	{
		char ch = 'z';
		upper(ch);
	}
	public static void upper(char ch) 
	{
    		if(ch >= 'a' && ch <= 'z') 
		{
        		ch = (char) (ch - 'a' + 'A');
        		System.out.println(ch);
    		}
		else if (ch >= 'A' && ch <= 'Z') 
		{
        		ch = (char) (ch - 'A' + 'a');
        		System.out.println(ch);
    		} 	
		else
		{
        		System.out.println("It is not Uppercase A - Z and Lowercase a - z");
    		}
	}

}