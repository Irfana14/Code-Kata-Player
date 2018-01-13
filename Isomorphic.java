import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
public class Isomorphic
{
   static boolean areIsomorphic(String str1, String str2)
    {
        int m = str1.length();
        int n = str2.length(); 
        Map<Character, Character> hashTable = new HashMap<Character, Character>();
        Boolean[] charExists = new Boolean[256];
        Arrays.fill(charExists, false);
        if(m != n)
            return false;
        for(int i=0;i<m;i++)
        {
        	if(charExists[str1.charAt(i)]==false)
        	{
        		hashTable.put(str1.charAt(i), str2.charAt(i));
        	    charExists[str1.charAt(i)]=true;
        	}
        	
        	else if(hashTable.get(str1.charAt(i))!=str2.charAt(i))
        		return false;        	
        }
        return true; 
    }
    public static void main (String[] args) 
    {
        boolean res = areIsomorphic("aab", "xxy");         
        System.out.println(res);
     

    }
}
