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
      String str, rev = "";
      Scanner sc = new Scanner(System.in);
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
      {
         rev = rev + str.charAt(i);
      } 
      if (str.equals(rev))
      {
         System.out.println("yes");
      }
      else
      {
         System.out.println("no");
      }
	}
}
