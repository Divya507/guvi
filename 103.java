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
		Scanner in=new Scanner(System.in);
		String line=in.nextLine();
		String Upper_case_line="";
		Scanner lineScan=new Scanner(line);
		while(lineScan.hasNext())
		{
			String word=lineScan.next();
	Upper_case_line+=Character.toUpperCase(word.charAt(0))+word.substring(1) +" ";
		}
		System.out.println(Upper_case_line.trim());
		}
	}
