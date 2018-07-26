/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,n3;
		Scanner Sc=new Scanner(System.in);
		n1=Sc.nextInt();
		n2=Sc.nextInt();
		n3=Sc.nextInt();
		if(n1>=n2 && n1>=n3)
		{
			System.out.println(n1);
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println(n2);
		}
		else
		{
			System.out.println(n3);
			}
	}
}
