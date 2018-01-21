import java.util.*;
import java.lang.*;


public class tofindnumberwithsameindex
{
	static void tofind(int[] arr)
	{
		int leng=arr.length;
		while(--leng>=0)
		{
			if(leng!=arr[leng])
				arr[leng]=-1;				
		}
		
		
		
		for(int j=0;j<leng-1;j++)
		{
			for(int k=j+1;k<leng;k++)
			{
				if(arr[k]<arr[j])
				{
					int temp=arr[k];
					arr[k]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("sorted array formed with same index");
		for(int v:arr)
		{
			if(v!=-1)
			System.out.print(v);
		}
		
		
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