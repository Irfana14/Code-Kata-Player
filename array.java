import java.util.*;
import java.lang.*;

public class array
{
	public static void main(String[] args)
	{
		int[] a= {1,2,3,5,6,7,8};
		int[] b= {5,6,7,8,1,2,3};
		int arrLength = b.length;
		int i=0,k=0;int flag=1;
		while(b[0]!=a[i])
		{
			i++;
		}
		for(int j=i;j<=arrLength;j++)
		{
			if(j!=arrLength)
			{
				if(b[k]==a[j])	
				{
				    k++;
				//break;
				}
				else
				    flag=0;
			}
			else if(j==arrLength)
			{
			    for(j=0;j<i;j++)
			    {
			        if(b[k]==a[j])
			            k++;
			        else
			            flag=0;
			    }
			    j=arrLength+1;
			}
		}
		
		if(flag==1)
			System.out.println("Rotational");
		else
			System.out.println("Not a rotational arr");
	}
	
	}