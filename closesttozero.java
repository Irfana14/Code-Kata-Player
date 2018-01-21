import java.util.*;
import java.math.*;
import java.lang.*;


public class closesttozero
{
	static void tofind(int[] arr)
	{
		int leng=arr.length;int temp=(int) Math.pow(2, 31);	int	a=0,b=0;
		for(int i=0;i<leng-2;i++)
		{
			for(int j=i+1;j<leng-1;j++)
			{
				if(Math.abs(arr[i]+arr[j])<temp)
				{
					temp=Math.abs(arr[i]+arr[j]);
					a=arr[i];b=arr[j];
				}
			}			
		}
		System.out.println("The closest integer is close to 0 is "+ a+" "+b);

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