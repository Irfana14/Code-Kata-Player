import java.util.*;
import java.lang.*;


public class tofindnumberonce
{
	static void tofind(int[] arr)
	{
		int leng=arr.length;
		
		for(int j=0;j<leng-1;j++)
		{
			int flag=0;
			for(int k=j+1;k<leng;k++)
			{
				if(arr[j]==arr[k])
				{
					flag=1;	
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Number is "+arr[j]);
				break;
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