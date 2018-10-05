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
		String str1;
		int n,i,k=0;
		char p;
		Scanner s=new Scanner(System.in);
		str1=s.next();
		p=s.next().charAt(0);
		n=str1.length();
		char[] ch=str1.toCharArray();
		for(i=0;i<n;i++)
		{
			if(p==ch[i])
			{
				k++;
			}
		}
		System.out.println(k);
	}
}
