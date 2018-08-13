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
		int n,i,max,min;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Sc.nextInt();
		}
		max=a[n-1];
		min=a[0];
		for(i=0;i<n;i++)
		{
		if(min>a[i])
				{
					min=a[i];
				}
		}
				for(i=0;i<n;i++)
				{
				 if(max<a[i])
				{
					max=a[i];
				}
				}
		System.out.println(min+"\t"+max);
		}
	}
