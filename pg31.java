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
		String s1;
		int i=0,c=0,c1=0;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		s1=s1+'\0';
		for(i=0;s1.charAt(i)!='\0';i++)
		{
			if(s1.charAt(i)=='(')
			{
				c=c+1;
			}
			else
			{
				c1=c1+1;
			}
		}
		if(c==c1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}

		
