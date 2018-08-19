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
        char ch;
        Scanner s=new Scanner(System.in);
        ch=s.next().charAt(0);
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println(ascii);
    }
}
