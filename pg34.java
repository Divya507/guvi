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
		int n,i,j;
		Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		n=str.length();
		char[] b=new char[10];
		char[] ch=str.toCharArray();
		j=0;
		for(i=0;i<n;i++)
		{
			if(ch[i]!=' ')
			{
				b[j]=ch[i];
				i=i+2;
				j++;
			}
		}
		for(j=0;j<10;j++)
		{
			System.out.println(b[j]);
		}
			}
		}
