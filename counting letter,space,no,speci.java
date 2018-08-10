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
		count(str);
	}
	public static void count(String x)
	{
		char[] ch=x.toCharArray();
		int letter=0;
		int space=0;
		int num=0;
		int other=0;
		for(int i=0;i<x.length();i++)
		{
		if(Character.isLetter(ch[i]))
		{
			letter++;
		}
		else if(Character.isDigit(ch[i]))
		{
			num++;
		}
		else if(Character.isSpace(ch[i]))
		{
			space++;
		}
		else
		{
			other++;
		}
	}
	System.out.println(other);
}
}
