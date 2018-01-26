import java.util.*;
import java.lang.*;

public class elementrepeat
{		
	public static void main (String[] args) 
    {
		int n;
		int k;
		System.out.println("Please enter values for N and K");
		Scanner sn= new Scanner(System.in);
		n=sn.nextInt();
		k=sn.nextInt();
		int[][] arr = new int[n][k];
		System.out.println("Please enter elements for array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
				arr[i][j]=sn.nextInt();
			}
		}
		int l=0;int j=0;
		while(l<k)
		{
			int t=arr[0][l];
			int flag=0;
			int i=1;
			for(j=0;j<k;j++)
			{				
				if(i<n)
				{
					if(t==arr[i][j])
					{
						flag=1;
						if(i==n-1)
							arr[i][j]=-1;
						i++;
						j=0;
					}
					else
						flag=0;
				}
			}			
			if(flag==0)
			{
				l++;
				i=1;
			}
			else if(flag==1)
			{
				System.out.print(arr[0][l]);
				l++;
			}
		}		
    }
}