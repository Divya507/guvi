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
		String str;
		Scanner s=new Scanner(System.in);
		str=s.next();
		int n,i;
		n=str.length();
		for(i=n-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		
	}
}
