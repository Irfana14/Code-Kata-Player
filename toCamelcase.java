
import java.util.Scanner;

public class toCamelcase
{
    
    static String casing(String str)
    {
        int slength=str.length();
        int i=0;
        char[] tempString= str.toCharArray();
        String CamelCased;
        while(i<slength)
        {        	
        	if(i==0)
        	{
        		tempString[i] = Character.toUpperCase(tempString[i]);
        		i++;
        	}
        	else if(tempString[i]==' ')
        	{
        		i++;
        		tempString[i] = Character.toUpperCase(tempString[i]);        
        	}
        	i++;
        }
        CamelCased = new String(tempString);             
        return CamelCased;
    }
    public static void main (String[] args) 
    {
    	System.out.println("Enter a String");
    	Scanner sn = new Scanner(System.in);
    	String res = sn.nextLine();
        System.out.println(casing(res));
     

    }
}