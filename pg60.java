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
		int i,n,p=0,j;
		Scanner s=new Scanner(System.in);
		str1=s.next();
		str2=s.next();
		n=str1.length();
		boolean flag=true;
		for(i=0;i<n;i++)
		{
			if(str1.charAt(i)==str2.charAt(i))
			{
				flag=false;
				System.out.println("yes");
				break;
			}
			else
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("no");
		}
	}
}
