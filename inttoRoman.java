import java.util.*;
import java.lang.*;

public class inttoRoman
{
	
	static String converter(int input)
	{
		String result= new String();
		while(input!=0)
		{
			if(input>=10)
			{
				result+='X';
				input-=10;
			}
			if(input==9)
			{
				result+="IX";
				input-=9;
			}
			
			if(input>=5)
			{
				result+='V';
				input-=5;			
				
			}
			if(input==4)
			{
				result+="IV";
				input-=4;
			}
			if(input<=3 && input!=0)
			{
				result+='I';
				input-=1;
			}
		}				
		return result;
	}
	public static void main(String[] args)
	{		
		System.out.println("Please enter a number");
		Scanner sn= new Scanner(System.in);		
		int a = sn.nextInt();
		//sn.close();		
		System.out.println(converter(a));
		
	}
	
	}