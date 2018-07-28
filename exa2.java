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
			int n,n1,n2,i,rem,temp,count=0;
		Scanner Sc=new Scanner(System.in);
		n1=Sc.nextInt();
		n2=Sc.nextInt();
		for(i=n1+1;i<n2;i++)
		{
			temp=i;
			n=0;
			while(temp!=0)
			{
				rem=temp%10;
				n=n+rem*rem*rem;
				temp=temp/10;
			}
			if(i==n)
			{
				System.out.println(i+"\t");
				count++;
			}

			}
		}
	}
