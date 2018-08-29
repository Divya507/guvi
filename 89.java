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
		char temp=0;
		int i,j;
		Scanner s=new Scanner(System.in);
		str=s.next();
		char a[]=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<str.length();j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<str.length();i++)
		{
			System.out.println(a[i]);
		}
				}
			}
