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
		int t,hour,min;
		Scanner Sc=new Scanner(System.in);
		t=Sc.nextInt();
		hour=t/60;
		min=t%60;
		System.out.println(hour+"\t"+min);
	}
}
