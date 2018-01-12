import java.util.*;
import java.lang.*;

public class reverseString
{
	public static void main(String[] args)
	{
		System.out.println("Please enter a string");
		Scanner sn= new Scanner(System.in);
		String a = sn.nextLine();
		sn.close();
		char[] reva= a.toCharArray();
		int i=0;char temp;
		int j=(a.length()-1);		
		while(i<(a.length()/2))
		{
			temp=reva[i];
			reva[i]=reva[j];
			reva[j]=temp;
			i++;j--;
		}
		String reveredString=new String(reva);
		System.out.println(reveredString);
	}
	
	}