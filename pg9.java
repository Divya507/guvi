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
		int l,r,i,j,k=0,num=0;
		Scanner s=new Scanner(System.in);
		l=s.nextInt();
		r=s.nextInt();
		for(i=l;i<=r;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k++;
				}
			}
			if(k==0)
			{
				num=num+1;
			}
			k=0;
		}
		System.out.println(num);
		}
	}
