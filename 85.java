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
		String str,str1,str2;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(i%2 == 0)
			{
			 System.out.println(ch[i]);	
				}
			
		}
			for(int i=0;i<str.length();i++)
		{
			if(i%2 != 0)
			{
		             System.out.println(ch[i]);	
				}
	
		}
		
	}
}
