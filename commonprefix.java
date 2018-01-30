import java.util.*;
import java.lang.*;

public class commonprefix
{	
	public static void main (String[] args) 
    {
		int n;
		Scanner sn = new Scanner(System.in);
		System.out.println("Please enter number of Strings");
		n= sn.nextInt();
		System.out.println("Please enter Strings");
		String first = sn.next();
		String sameprefix=first;
		char[] firstarr = first.toCharArray();
		int count=first.length();
		for(int i=1;i<n;i++)
		{
			String temp = sn.next();
			char[] arr = temp.toCharArray();	
			int j=0;
			int tempcount=0;
			int length;
			if(firstarr.length>arr.length)
				length=arr.length;
			else
				length =firstarr.length;		
			while(j<length)
			{
				if(firstarr[j]==arr[j])
				{
					tempcount++;
				}
				j++;
			}
			if(count>tempcount)
				count=tempcount;			
		}
		
		for(int k=0;k<count;k++)
			System.out.print(firstarr[k]);

    }
}