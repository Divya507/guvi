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
		int a,b,temp=0;
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
		if((a<=b)|(a>=b)|(a==b))
		{
			temp=a;
			a=b;
			b=temp;
		}
		System.out.println(a+"\t"+b);
	}
}
