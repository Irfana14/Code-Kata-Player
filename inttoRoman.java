import java.util.*;
import java.lang.*;

public class inttoRoman
{
	static int a;
	static void takeinput() {
		System.out.println("Please enter no less than 20");
		Scanner sn= new Scanner(System.in);		
		a = sn.nextInt();
		if(a>20)
			takeinput();
	}
	
	static String converter(int input)
	{
		String result= new String();
		while(input!=0)
		{
			while(input>=10)
			{
				result+='X';
				input-=10;
			}
			if(input==9)
			{
				result+="IX";
				input-=9;
			}
			
			while(input>=5)
			{
				result+='V';
				input-=5;			
				
			}
			while(input==4)
			{
				result+="IV";
				input-=4;
			}
			while(input<=3 && input!=0)
			{
				result+='I';
				input-=1;
			}
		}				
		return result;
	}
	public static void main(String[] args)
	{		
		takeinput();
		System.out.println(converter(a));
		
	}
	
	}
