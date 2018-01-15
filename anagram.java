import java.util.*;
public class anagram
{	
	static HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
	
	static int analyse(String c_string)
	{
		String toanalyse = "kabali";
		char[] arrstring= toanalyse.toCharArray();
		char[] ana_arr = c_string.toCharArray();
		int j=0;int flag=1;
		for (int i=0;i<arrstring.length;i++)
		{
			int temp=0;
			j=0;
			while(j<arrstring.length)
			{
				if(arrstring[i]==arrstring[j])
				{
					temp++;					
				}
				j++;
				hash.put(arrstring[i], temp);
			}
		}
		for(int i=0;i<ana_arr.length;i++)
		{
			if(hash.containsKey(ana_arr[i]))
			{
				int t = hash.get(ana_arr[i]);
				t--;
				hash.replace(ana_arr[i], t);
			}
		}
		for(Map.Entry<Character,Integer> hashs : hash.entrySet())
		{
			if(hashs.getValue()!=0)
			{		
				flag=0;
				break;
			}				
		}
		if(flag==1)
			return 0;
		else
			return 1;		
	}
	
	public static void main (String[] args) 
    {
		System.out.println("Enter n");
		Scanner sn= new Scanner(System.in);
		int n=sn.nextInt();
		int t=n;
		while(n>0)
		{
			String s = sn.next();
			System.out.println(s);
			t -=analyse(s);
			n--;			
		}	
		System.out.println("String in Anagram "+ t);
    	
    }
	}