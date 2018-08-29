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
		i=0;
		while(i<str.length())
		{
			System.out.println(str.charAt(i));
			i=i+2;
		}
		System.out.println("\t");
		i=1;
		while(i<str.length())
		{
			System.out.println(str.charAt(i));
			i=i+2;
		}
	}
}
