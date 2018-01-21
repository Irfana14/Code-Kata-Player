import java.util.*;
import java.lang.*;


public class largestnumber
{
	static void tofindlarge(int[] arr)
	{
		int leng=arr.length;
		for(int j=0;j<leng-1;j++)
		{
			for(int k=j+1;k<leng;k++)
			{
				if(arr[k]>arr[j])
				{
					int temp=arr[k];
					arr[k]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Largest number formed");
		for(int v:arr)
			System.out.print(v);
		
		
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
		tofindlarge(arra);		
	
	}
	
	}