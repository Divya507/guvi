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
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
LinkedList<Integer> stack = new LinkedList<Integer>();
while (n > 0) 
{
    stack.push( n % 10 );
    n = n / 10;
}

while (!stack.isEmpty()) 
{
    System.out.println("\t"+stack.pop()+"\t");
}
	}
}
