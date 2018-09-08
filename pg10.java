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
		
		String str1,str2;
		int a=0;
		Scanner s=new Scanner(System.in);
		str1=s.next();
		str2=s.next();
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				a++;
			}
		}
		if(a==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
