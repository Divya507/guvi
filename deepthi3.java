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
		int i,n=10,max;
		int a[]=new int[n];
		Scanner Sc=new Scanner(System.in);
		for(i=0;i<n;i++)
		{
			a[i]=Sc.nextInt();
		}
		max=a[0];
		for(i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
