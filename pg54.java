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
		String s1,s2;
		int n,m,i;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		s2=s.next();
		boolean flag=false;
		n=s1.length();
		m=s2.length();
		if(n==m)
		{
			for(i=0;i<n;i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					flag=true;
				}
				else
				{
					flag=false;
					System.out.println("no");
					break;
				}
			}
			}
			else
			{
				System.out.println("no");
			}
			if(flag)
			{
				System.out.println("yes");
			}
			}
	}
