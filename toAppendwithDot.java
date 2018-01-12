import java.util.*;
import java.lang.*;

public class toAppendwithDot
{
	
	static String append(String input)
	{
		char[] toAppend = input.toCharArray();		
		int i=toAppend.length;
		int app=i+1;
		char[] append= new char[app];
		int j =0;
		while(j<=i)
		{
			if(j<i)
			{
				append[j]=toAppend[j];	
				
			}
			
			if(j==i)
			{
				append[j]='.';
			}
			j++;
		}
		String textis= new String(append);			
		return textis;
	}
	public static void main(String[] args)
	{		
		System.out.println("Please enter a text");
		Scanner sn= new Scanner(System.in);		
		String a = sn.nextLine();
		//sn.close();		
		System.out.println(append(a));
		
	}
	
	}