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
		int n,i,k,p;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] a=new int[n];
		int[] c=new int[10];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		k=0;
		for(i=0;i<n;i++)
		{
			if(n>a[i])
			{
				c[k]=a[i];
				k++;
			}
		}
		p=k;
		for(k=0;k<p;k++)
		{
			System.out.println(c[k]+" ");
		}
		
		}
}
