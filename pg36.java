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
		String str;
		int i,j=0,n;
		str=s.next();
		char k;
		k=s.next().charAt(0);
		n=str.length();
		char[] ch=str.toCharArray();
		for(i=0;i<n;i++)
		{
			if(k==ch[i])
			{
				j++;
			}
		}
	System.out.println(j);
}
}
