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
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int digits=0,i;
		for(i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				digits++;
			}
		}
		System.out.println(digits);
	}
}
