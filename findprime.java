
import java.util.Scanner;
//import java.math.*;

public class findprime
{
    
    static void toprime(int num1, int num2)
    {
    	if(num2<num1)
    	{
    		int t=num1;
    		num1=num2;
    		num2=t;
    	}
    	int flag=1;int e=0;
        for(int i=num1;i<=num2;i++)
        {        	
        	double a=Math.sqrt(i); 
        	int temp = (int) Math.ceil(a);        	
        	A :for(int j=2;j<=temp;j++)
        	{
        		
        		if(i==2)
        		{
        			flag=1;        			
        			break A;        			
        		}
        		else if((i%j)==0)
        		{
        			flag =0;        			
        			break A;
        		}
        		
        		else
        		{
        			flag=1;          			
        		}
        	}
        	if(flag==1)
        	{	
        		e++;
        		System.out.print(" "+i);  
        	}
        }
        System.out.println();
        System.out.println(e+" prime number exixts");
        
    }
    public static void main (String[] args) 
    {
    	System.out.println("Enter two numbers");
    	Scanner sn = new Scanner(System.in);
    	int n1 = sn.nextInt();
    	int n2 = sn.nextInt();
        toprime(n1,n2);

    }
}