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
		int n,m,r;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		r=n*m;
		        int sqrt = (int) Math.sqrt(r);
	        if(sqrt*sqrt == r) 
	        {
	            System.out.println("yes");

	        }
	        else
	        {

	            System.out.println("no");

	        }
		
	}
}
