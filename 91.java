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
		int l,b,h;
		int area,vol;
		Scanner s=new Scanner(System.in);
		l=s.nextInt();
		b=s.nextInt();
		h=s.nextInt();
		area=2*(l*b+b*h+h*l);
		vol=l*b*h;
		System.out.println(area+" "+vol);
	}
}
