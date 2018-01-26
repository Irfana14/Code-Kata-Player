import java.util.*;
import java.lang.*;

public class sumofarray
{	

	
	
	public static void main (String[] args) 
    {
		int n;
		int sum=0;	
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter size of array");
		n=sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			sum+=arr[i];
		System.out.println("Sum is "+sum);
    }
}