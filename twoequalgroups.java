import java.util.*;
import java.lang.*;

public class twoequalgroups
{	
	public static void main (String[] args) 
    {
		int n,a,b;
		System.out.println("Please enter number");
		Scanner sn= new Scanner(System.in);
		n=sn.nextInt();
		System.out.println("Please enter A and B");
		a=sn.nextInt();
		b=sn.nextInt();		
		int c=(a+b)*2;
		if(n%c==0)
			System.out.println("YES");
		else
			System.out.println("NO");

    }
}