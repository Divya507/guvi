/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int l,r,gcd=0,i,lcm;
		Scanner s=new Scanner(System.in);
		l=s.nextInt();
		r=s.nextInt();
		for(i=1;i<=l && i<=r;i++)
		{
			if(l%i==0 && r%i==0)
			{
				gcd=i;
			}
		}
		lcm=(l*r)/gcd;
		System.out.println(lcm);
	}
}
