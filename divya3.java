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
		int i,j,n,temp;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
}
