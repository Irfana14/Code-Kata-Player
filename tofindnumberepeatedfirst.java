import java.util.*;
import java.lang.*;


public class tofindnumberepeatedfirst
{
	static void tofind(int[] arr)
	{
		int leng=arr.length;
		
		A:for(int j=0;j<leng-1;j++)
		{
			for(int k=j+1;k<leng;k++)
			{
				if(arr[j]==arr[k])
				{
					System.out.println(arr[j]);
					break A;
				}
			}
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