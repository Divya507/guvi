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
		int count=0,cou=0,i;
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				count++;
			}
			if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<='Z'))
			{
				cou++;
			}
		}
		if(count==0 && cou==0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
	}
}
