class Uppercase
{
	public static void main(String[] args)
	{
		char ch = '*';
		upper(ch);
	}
	public static void upper(char ch) 
	{
    		if(ch >= 'a' && ch <= 'z') 
		{
        		ch = (char) (ch - 'a' + 'A');
        		System.out.println("Upper case : " + ch);
    		} 	
		else
		{
        		System.out.println("It is not Lowercase a - z");
    		}
	}

}