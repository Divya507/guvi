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
		String str1,str2,str3;
		int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	str1=s.next();
	str2=str1.replaceAll("[aeiouAEIOU]","");
	str3=new StringBuilder(str2).reverse().toString();
	System.out.println(str3);
	}
}
