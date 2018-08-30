/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Isogram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		isIsogram(str);
	}
	static void isIsogram(String s)
	{
		String[] ary=s.split("");	
		Set<String> myset=new HashSet<String>(Arrays.asList(ary));
		if(s.length()==myset.size())
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		}
	
}
