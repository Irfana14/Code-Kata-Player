import java.util.*;
import java.lang.*;

public class islandmatrix
{		
	public static void main (String[] args) 
    {
		int n;
		int count=0;
		System.out.println("Please enter N");
		Scanner sn= new Scanner(System.in);
		n=sn.nextInt();
		int[][] arr= new int[n][n];
		System.out.println("Please enter elements");
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				arr[i][j]=sn.nextInt();
			}
		}
		System.out.println("Matrix is");
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(arr[i][j]==1)
				{
				if(i==0 && j==0)
				{
					if(arr[i+1][j]==0 && arr[i][j+1]==0 && arr[i+1][j+1]==0)
						count++;
				}
				else if(i!=0 && j==0 && i!=n-1)
				{
					if(arr[i-1][j]==0 && arr[i][j+1]==0 && arr[i+1][j]==0 && arr[i-1][j+1]==0 && arr[i+1][j+1]==0)
						count++;
				}
				else if(i==n-1 && j==0)
				{
					if(arr[i-1][j]==0 && arr[i][j+1]==0 && arr[i-1][j+1]==0)
						count++;
				}
				else if(i==0 && j==n-1)
				{
					if(arr[i][j-1]==0 && arr[i+1][j]==0 && arr[i+1][j-1]==0)
						count++;
				}
				else if(i!=0 && i!=n-1 && j==n-1)
				{
					if(arr[i-1][j]==0 && arr[i+1][j]==0 && arr[i][j-1]==0 && arr[i-1][j-1]==0 && arr[i+1][j-1]==0)
						count++;
				}
				else if(i==n-1 && j==n-1)
				{
					if(arr[i-1][j]==0 && arr[i][j-1]==0 && arr[i-1][j-1]==0)
						count++;
				}
				else 
				{
					if(arr[i][j-1]==0 && arr[i-1][j-1]==0 && arr[i-1][j]==0 && arr[i-1][j+1]==0 && arr[i][j+1]==0 && arr[i+1][j+1]==0 && arr[i+1][j]==0 && arr[i+1][j-1]==0)
						count++;
				}
				}
				
			}			
		}
		System.out.println("Total Island is "+count);
		
    }
}