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
		String s;
		int i,k;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		k=sc.nextInt();
		char[] ch=s.toCharArray();
		for(i=0;i<k;i++)
		{
			System.out.println(ch[i]);
		}
		
	}
}
