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
		int i;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		int n=str.length();
		char[] ch=str.toCharArray();
		if(n%2!=0)
		{
			i=n/2;
			ch[i]='*';
			for(i=0;i<n;i++)
			{
			System.out.println(ch[i]);
			}
		}
		else
		{
			i=n/2;
			ch[i]='*';
			ch[i-1]='*';
			for(i=0;i<n;i++)
			{
			System.out.println(ch[i]);
			}
		}		
		
	}
}
