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
		char temp[100000];
		char a[]=str.toCharArray();
		for(int i=0;i<str.length();i=+2)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0;i<str.length();i++)
		{
			System.out.println(a[i]);
		}
		
		
	}
}
