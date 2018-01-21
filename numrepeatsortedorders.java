import java.util.*;
import java.lang.*;


public class numrepeatsortedorders
{
	static void numrepeatsort(int[] arr)
	{
		int i=arr.length;		
		int t=0;
		int a=0;
		
		while(a<i)
		{
			int flag=0;int k=0;
			for(int j=a+1;j<arr.length;j++)
			{
				if(arr[a]==arr[j] && arr[a]!=-1)
				{
					flag=1;
					for(k=j;k<arr.length;k++)
					{
						if(arr[k]==arr[a])
							arr[k]=-1;
					}
					t++;	
					break;
				}
			}			
			if(flag==0)
				arr[a]=-1;
			a++;
		}
		
		for(int z : arr)
			System.out.print(z+" ");
		
		int[] sortedarr = new int[t];
		int z=0;
		for(int v: arr)
		{			
			if(v!=-1)
			{
				sortedarr[z]=v;
			z++;
			}
		}		

		for(int j=0;j<sortedarr.length-1;j++)
		{
			for(int k=j+1;k<sortedarr.length;k++)
			{
				if(sortedarr[k]<sortedarr[j])
				{
					int tempr=sortedarr[j];
					sortedarr[j]=sortedarr[k];
					sortedarr[k]=tempr;
				}
			}
		}
		System.out.println();
	  for(int r: sortedarr)
			System.out.print(r+" ");
	}
	public static void main(String[] args)
	{
		System.out.println("Enter number of elements");
		Scanner sn = new Scanner(System.in);
		int a=sn.nextInt();
		int[] arr = new int[a];
		while(--a>=0)
		{			
		    arr[a]=sn.nextInt();
		}		
		numrepeatsort(arr);		
	}
	
	}