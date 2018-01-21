import java.util.*;
import java.lang.*;


public class evenandodd
{
	static void tofind(int[] arr)
	{
		int leng=arr.length;
		for(int i=0;i<leng;i++)
		{
			if(i%2==0 && arr[i]%2!=0)
				System.out.print(arr[i]+" ");
			else if(i%2!=0 && arr[i]%2==0)
				System.out.print(arr[i]+" ");				
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