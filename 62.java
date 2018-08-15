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
		int num;
		Scanner S=new Scanner(System.in);
		num=S.nextInt();
		isBinaryOrNot(num);
	}
		
		static void isBinaryOrNot(int n)
    {
        boolean isBinary = true;
 
        int c=n;
 
        while (c != 0)
        {
            int temp = c%10;   //Gives last digit of the number
 
            if(temp > 1)
            {
                isBinary = false;
                break;
            }
            else
            {
                c = c/10;    //Removes last digit from the number
            }
        }
 
        if (isBinary)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
    }
	}
}
