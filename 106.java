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
		int i,j,n,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[100];
		for( i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		j=0;
		for(i=0;i<n;i++)
		{
			if(a[i] %2 != 0)
			{
				b[j]=a[i];
				j++;
			}
		}
		j=k-1;
		System.out.println(b[j]);
	}
}
