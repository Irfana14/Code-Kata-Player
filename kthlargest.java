import java.util.HashMap;
import java.util.Scanner;

public class kthlargest
{    
    static void kthlarge(int[] arr,int k)
    {
    	int max=arr[0];

    	for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i]<arr[j])
    			{
    				int temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
    	int i=0;int count =k;
    	while(i<arr.length-1 && count >0)
    	{
    		if(arr[i]==arr[i+1])
    		{
    			k++;
    			count--;
    		}
    		count--;
    		i++;
    	}
    	
    	System.out.println("Number is "+arr[k-1]);
    }
    public static void main (String[] args) 
    {
    	System.out.println("Enter a N and K");
    	Scanner sn = new Scanner(System.in);
    	int n=sn.nextInt();
    	int k=sn.nextInt();
    	System.out.println(n+" "+k);
    	int[] arr = new int[n];
    	System.out.println("Enter elements for array");
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sn.nextInt();
    	}    	
    	kthlarge(arr, k);
    }
}