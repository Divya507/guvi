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
		int n,k,i;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(k==a[i])
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
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
