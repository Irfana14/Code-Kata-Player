import java.util.*;
import java.lang.*;

public class nearestofk
{		
	public static void main (String[] args) 
    {
		int n;
		int k;
		int diff=99999;
		int temp=0;
		int i=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter size of array");
		n=sc.nextInt();
		System.out.println("Please enter K");
		k=sc.nextInt();
		int[] arr = new int[n];
		for(int l =0;l<n;l++)
			arr[l]=sc.nextInt();
		while(i<3)
		{
			int flag=0;
			for(int j=0;j<n;j++)
			{
			if(diff>Math.abs(k-arr[j]) && arr[j]!=-1 && k!=arr[j])
			{
				temp=j;
				diff=Math.abs(k-arr[j]);
				flag=1;
			}
			}
			if(flag==1)
			{
			System.out.println(arr[temp]);
			arr[temp]=-1;
			diff=99999;
			}
			i++;
		}	
    }
}