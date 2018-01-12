import java.util.*;
import java.lang.*;

public class factorial
{
	static int a;
	static void takeinput()
	{
		System.out.println("Please enter a number(<20) to compute factorial");
		Scanner sn= new Scanner(System.in);		
		a = sn.nextInt();			
		if(a>20)
		{
			takeinput();			
		}
		sn.close();
		
	}
	static int fact(int num)
	{
		int result=1;
		while(num>1)
		{
			result*=num;
			num--;
		}
		return result;
	}
	public static void main(String[] args)
	{		
		takeinput();
		int facto = fact(a);
		System.out.println(facto);
		
	}
	
	}