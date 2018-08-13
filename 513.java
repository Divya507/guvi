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
		int n,digit=0,r;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		while(n>0)
		{
		r=n/10;
		n=n/10;
		digit++;
		}
		System.out.println(digit);
	}
}
