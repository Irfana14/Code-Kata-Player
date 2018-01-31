import java.util.*;
import java.lang.*;

public class afterdeletingkdigitssmall
{	
	public static void main (String[] args) 
    {
		int n,k;
		Scanner sn = new Scanner(System.in);
		System.out.println("Please enter n");
		n= sn.nextInt();
		double temp=n;
		System.out.println("Please enter K");
		k=sn.nextInt();		
		int i=0;
		while(temp>0)
		{
			temp=temp/10;
			i++;
		}		
		int[] arr= new int[i];
		temp=n;
		for(int j=i-1;j>=0;j--)
		{
			arr[j]=(int)temp%10;
			temp=temp/10;
		}
		int smalldigit=99999999;int digitfirst=0;
		while(k>0)
		{
			int d=0;int num=0;
			for(int l=0;l<i;l++)
			{				
				if(arr[l]!=-1)
				{
				for(int m=0;m<i;m++)	
				{
				if(m!=d && arr[m]!=-1)
					num=(num*10)+arr[m];				
				}
				}
				if(num<smalldigit)
				{
					smalldigit=num;
					digitfirst=l;
				}
				d++;
			}
			arr[digitfirst]=-1;
			k--;
		}
		System.out.println(smalldigit);

    }
}