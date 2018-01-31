import java.util.*;
import java.lang.*;

public class convertxtoy
{	
	public static void main (String[] args) 
    {
		String X,Y;
		Scanner sn= new Scanner(System.in);
		X=sn.next();
		Y=sn.next();		
		int count=0;
		char[] arr1=X.toCharArray();
		char[] arr2=Y.toCharArray();
		int j=arr1.length-1;
		if(arr2.length-1<j)
			count+=(j-(arr2.length-1));
		System.out.println(j);
		for(int i=0;i<arr2.length;i++)
		{
			if(i>j)
				count++;
			else if(arr2[i]!=arr1[i])
				count++;
						
		}
		System.out.println("Cost is "+ count);

    }
}