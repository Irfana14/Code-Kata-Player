import java.util.*;

public class numrepeat
{
	
	public static void main (String[] args) 
    {
    	System.out.println("Enter number of elements");
    	Scanner sn = new Scanner(System.in);
    	int n= sn.nextInt();
    	int[] arr=new int[n];
    	System.out.println("Enter the elements");
    	int i=0;int flag=1;
    	n--;
    	while(n>=0)
    	{
    		arr[i]=sn.nextInt();
    		i++;
    		n--;
    	}
    	A:for(int j=0;j<arr.length;j++)
    	{
    		B:for(int k=0;k<arr.length;k++)
    		{
    			if(arr[j]==arr[k] && j!=k)
    			{
    				flag=0;     
    				break B;
    			}
    			else
    				flag=1;
    		}    
        	if(flag==1)
        	{
    		System.out.println("Result is " +arr[j]);
    		break A;
        	}
    			
    	}
    	
    }
}