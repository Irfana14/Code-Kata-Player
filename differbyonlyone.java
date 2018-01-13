import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
public class differbyonlyone
{
   static boolean aredifferbyone(String str1, String str2)
    {
        int m = str1.length();
        int n = str2.length(); 
        int differ=0;
        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();          
        if(m != n)
            return false;
        for(int i=0;i<m;i++)
        {
        	if(char1[i]!=char2[i])
        	{
        		differ++;
        		if(differ>1)
        			return false;
        	}     		        	
        }
        if(differ!=1)
        	return false;
        else
        	return true;        
    }
    public static void main (String[] args) 
    {
        boolean res = aredifferbyone("aab", "aay");         
        System.out.println(res);
     

    }
}