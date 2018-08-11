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
		int lines=0;
		String str;
		Scanner SC=new Scanner(System.in);
		str=SC.next();
		while(SC.hasNextLine())
		{
			SC.nextLine();
			lines++;
		}
		System.out.println(lines);
	}
}
