
import java.util.Scanner;

public class evenoddswap
{
    
    static String swap(String str)
    {
        int slength=str.length();
        char temp;
        char[] tempString= str.toCharArray();
        String swap;
        for(int i=0;(i<slength-1);i+=2)
        {   
        	temp = tempString[i];
        	tempString[i]=str.charAt(i+1);
        	tempString[i+1]=temp;
        }
        swap = new String(tempString);
        return swap;
    }
    public static void main (String[] args) 
    {
    	System.out.println("Enter a String");
    	Scanner sn = new Scanner(System.in);
    	String res = sn.nextLine();
        System.out.println(swap(res));
     

    }
}