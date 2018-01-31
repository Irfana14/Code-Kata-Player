import java.util.*;
import java.lang.*;

public class gcf
{	
	public static void main (String[] args) 
    {
		int n,q,a,b;int gcf=0;
		
		System.out.println("Please enter N");
		Scanner sn= new Scanner(System.in);
		n=sn.nextInt();
		System.out.println("Please enter Q");
		q=sn.nextInt();
		int[] arr = new int[n];
		System.out.println("Please enter array elements");
		for(int k=0;k<n;k++)
			arr[k]=sn.nextInt();
		
		while(q>0)
		{
		System.out.println("Please enter A and B");
		a=sn.nextInt();
		b=sn.nextInt();		
		if(a>b)
		{
			int temp=a;
			a=b;
			b=temp;						
		}
		int i=1;
		while(i<=a)
		{
			if(a%i==0 && b%i==0)
				gcf=i;
			i++;				
		}
		System.out.println(gcf);
		q--;
		}

    }
}