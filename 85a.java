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
		String st;
		int i;
		Scanner s=new Scanner(System.in);
		st=s.nextLine();
		i=0;
		while(i<st.length())
		{
			
			System.out.println(st.charAt(i));
			i=i+2;
			
		}
		System.out.println("\t");
		i=1;
		while(i<st.length())
		{
			
			System.out.println(st.charAt(i));
			i=i+2;
			
		}
	}
}
