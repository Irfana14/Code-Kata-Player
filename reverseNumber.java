import java.util.*;
import java.lang.*;

public class reverseNumber
{
	
	static int reversenum(int num)
	{
		int result=0;
		while(num>0)
		{
			result=result*10;
			result += (num%10);
			num=num/10;
			
		}
		return result;
	}
	public static void main(String[] args)
	{		
		System.out.println("Please enter a number to reverse");
		Scanner sn= new Scanner(System.in);		
		int a = sn.nextInt();
		sn.close();		
		System.out.println(reversenum(a));
		
	}
	
	}