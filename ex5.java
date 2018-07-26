/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char s;
		Scanner Sc=new Scanner(System.in);
		s=Sc.next().charAt(0);
		if(s=='a'|| s=='e' || s=='i' || s=='o' || s=='u')
		{
			System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonent");
			}
	}
}
