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
		int n,s,e,i;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s=sc.nextInt();
		e=sc.nextInt();
		for(i=s+1;i<e;i++)
		{
			if(n==i)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
