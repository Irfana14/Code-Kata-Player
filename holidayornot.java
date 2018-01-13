import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
public class holidayornot
{
	static String[] holiday = new String[]{"Saturday", "Sunday"};
	static String[] workingday = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday"};	
	
	static String casing(String str)
    {
        int slength=str.length();
        int i=0;
        char[] tempString= str.toCharArray();
        String CamelCased;
        while(i<slength)
        {        	
        	if(i==0)
        	{
        		tempString[i] = Character.toUpperCase(tempString[i]);
        		i++;
        	}
        	else
        	{        		
        		tempString[i] = Character.toLowerCase(tempString[i]);  
        		i++;
        	}
        	
        }
        CamelCased = new String(tempString);             
        return CamelCased;
    }
   static String checkday(String str1)
    {
	   String str=casing(str1);
       for(String s: holiday)
       {
    	   if(str.equals(s))
    		   return str+" is Holiday";
       }
       for(String s:workingday)
       {
    	   if(str.equals(s))
    		   return str+" is Workingday";
       }
       return "Enter valid day";
    }
    public static void main (String[] args) 
    {
    	System.out.println("Please enter a day");
    	Scanner sn = new Scanner(System.in);
    	String day = sn.nextLine();
        String res = checkday(day);         
        System.out.println(res);
     

    }
}