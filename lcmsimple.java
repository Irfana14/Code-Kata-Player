import java.util.*;
import java.lang.*;

public class lcmsimple
{	
	static HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();

	void findinglcm(int num)
	{
		// HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		 int temp=0;int flag=1;
		 while(num%2==0)
		 {
			temp++;
			if(num%2==0)
					num=num/2;	
		 }
		 if(!hash.containsKey(2))
			 hash.put(2, temp);
		 if(temp>hash.get(2))
		 {
			 hash.remove(2);
			 hash.put(2, temp);
		 }

		 for(int i =3; i<=num;i++)
		 {
			 int k=2;
			 A: while(k<i)
				{				
					if(i%k==0)
					{
						flag=0;						
						break A;
					}
					else
					{
						flag=1;
						k++;
					}
				}
		 
			if(flag == 1)
			{				
				temp=0;
				while(num%i==0)
				{
					++temp;
					if(num%i==0)
						   num=num/i;	
				}				
				 if(!hash.containsKey(i))
					 hash.put(i, temp);	 
				 if(temp>hash.get(i))
				 {
					 hash.remove(i);
					 hash.put(i, temp);
				 }

	         }
        }
	}
	
	public static void main (String[] args) 
    {
    	System.out.println("Enter two numbers");
    	Scanner sn = new Scanner(System.in);
    	int a= sn.nextInt();
    	int b =sn.nextInt();
    	lcmsimple num1= new lcmsimple();
    	lcmsimple num2= new lcmsimple();
    	num1.findinglcm(a);
    	num2.findinglcm(b); 
    	int result = 1;
		for(Map.Entry<Integer, Integer> ent: hash.entrySet())
		{
			int p = ent.getKey();
			int v = ent.getValue();		
			System.out.println(p+" "+v);
			result *= Math.pow(p, v);
		}
		System.out.println(result);  

}
}