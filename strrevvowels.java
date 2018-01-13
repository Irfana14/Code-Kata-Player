import java.util.Scanner;

public class strrevvowels
{    
    static void strrev(String s)
    {
    	char[] str=s.toCharArray();
    	char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
    	int flag=0;
    	String reverse= new String();
    	int leng= s.length()-1;    	
    	while(leng>=0)
    	{
    			B:for(char d: vowels)
    			{
    				if(str[leng]==d)
    				{
    					flag=0;
    					break B;
    				}
    				else
    				{
    					flag=1;
    				}
    			}
    	if(flag==1)
    		reverse+=str[leng];
    	leng--;
    	}    	
    	System.out.println(reverse);

    }
    public static void main (String[] args) 
    {
    	System.out.println("Enter a string");
    	Scanner sn = new Scanner(System.in);
    	String s = sn.nextLine();
        strrev(s);
    }
}