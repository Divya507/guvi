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
		int n,b;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0)
		{
			b=n/2;
			System.out.println(b);
		}
		else
		{
			System.out.println(n);
		}
	}
}
