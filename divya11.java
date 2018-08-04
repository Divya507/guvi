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
		int h,h1,h2,m,m1,m2;
		Scanner Sc=new Scanner(System.in);
		h1=Sc.nextInt();
		m1=Sc.nextInt();
		h2=Sc.nextInt();
		m2=Sc.nextInt();
		h=h1-h2;
		m=m1-m2;
		System.out.println(h+"\t"+m);
	}
}
