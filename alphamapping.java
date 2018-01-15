import java.util.HashMap;
import java.util.Scanner;
//import java.math.*;

public class alphamapping
{    
    static void mapscript(String s)
    {    	
    	char[] arr = s.toCharArray();    	
    	for(int i=0;i<s.length();i++)
    	{
    		if(arr[i]=='x')
    			System.out.print('a');
    		else if(arr[i]=='y')
    			System.out.print('b');
    		else if(arr[i]=='z')
    			System.out.print('c');
    		else if(arr[i]=='X')
    			System.out.print('A');
    		else if(arr[i]=='Y')
    			System.out.print('B');
    		else if(arr[i]=='Z')
    			System.out.print('C');
    		else
    		System.out.print((char)(arr[i]+3));
    		
    	}    	      
    }
    public static void main (String[] args) 
    {
    	System.out.println("Please enter a String");
    	Scanner sn = new Scanner(System.in);
    	String a=sn.next();
    	mapscript(a);
    }
}