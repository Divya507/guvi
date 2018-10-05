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
		int a,b,c=1;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		while(b>0)
		{
			c=a*c;
			b--;
		}
		System.out.println(c);
	}
}
