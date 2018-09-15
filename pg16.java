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
		int n;
		int sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		ArrayList<Integer>a=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int c=s.nextInt();
			a.add(c);
		}
		for(int i=0;i<a.size();i++)
		{
			Integer v=Collections.frequency(a,a.get(i));
			if(v==1)
			{
				System.out.println(a.get(i));
				break;
			}
		}
	}
}
