import java.util.*;
import java.lang.*;


public class tofindnumberepeatedfirst
{
	static void tofind(int[] arr)
	{
		int leng=arr.length;
		int flag=0;
		
		A:for(int j=0;j<leng-1;j++)
		{
			for(int k=j+1;k<leng;k++)
			{
				if(arr[j]==arr[k])
				{
					System.out.println(arr[j]);
					flag=1;
					break A;
				}
			}
		}
		if(flag==0)
			System.out.println("Unique");

	}
	public static void main(String[] args)
	{
		System.out.println("Enter number of digits");
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		System.out.println("Please enter numbers");
		int[] arra= new int[n];
		for(int i=0;i<n;i++)
			arra[i]=sn.nextInt();
		tofind(arra);		
	}	
	}
