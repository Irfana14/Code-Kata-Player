import java.util.*;
import java.math.*;
import java.lang.*;


public class reversestringf
{
	static void reverse(String a)
	{
		char[] arr=a.toCharArray();
		int i=0;int j=arr.length-1;
		while(i<(arr.length/2))
		{
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		String prints=new String(arr);
		System.out.print(prints+" ");

	}
	public static void main(String[] args)
	{		
		System.out.println("Enter the string");
		Scanner sn = new Scanner(System.in);
		String a =sn.nextLine();
		int leng=a.length();
		int i=0;
		char[] stringarr=a.toCharArray();
		/*for(char v:stringarr)
		  System.out.println(v);*/
		String temp="";
		while(i<leng)
		{	
			if(stringarr[i]!=' ')
			  temp+=stringarr[i];
			if(stringarr[i]==' ')
			{
				reverse(temp);
				temp="";
			}
			if(i==leng-1)
				reverse(temp);
			i++;		

		}				
	}	
	}