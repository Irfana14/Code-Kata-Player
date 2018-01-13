import java.util.Scanner;

public class shiftright
{
    
    static void rightShift(int[] arr, int n,int k)
    {
    	for(int i=0;i<n;i++)
    	{
    		int temp = arr[k-1];
    		for(int j=k-1;j>0;j--)
    		{
    			arr[j]=arr[j-1];    			
    		}
    		arr[0]=temp;
    	}
    	for(int s: arr)
    	{
    		System.out.println(s+" ");
    	}
    }
    public static void main (String[] args) 
    {
    	System.out.println("Enter value for N and K");
    	Scanner sn = new Scanner(System.in);
    	int n = sn.nextInt();
    	int k= sn.nextInt();
        System.out.println("Enter array values");
        int[] arr= new int[k];
        for(int i=0;i<k;i++)
        	arr[i]=sn.nextInt();
        rightShift(arr,n,k);
    }
}