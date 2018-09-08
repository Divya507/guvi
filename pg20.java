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
		char a[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(a[i]=='X')
			System.out.println("A");
			else if(a[i]=='Y')
			System.out.println("B");
			else if(a[i]=='Z')
			System.out.println("C");
			else
			System.out.println((char)(a[i]+3));
		}
	}
}
