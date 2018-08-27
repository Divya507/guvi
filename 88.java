import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      int n1,n2,gcd=0,lcm;
      Scanner s=new Scanner(System.in);
      n1=s.nextInt();
      n2=s.nextInt();
      for(int i=1;i<=n1 && i<=n2;i++)
      {
        if(n1%i==0 && n2%i==0)
        {
          gcd=i;
        }
      }
      lcm=(n1*n2)/gcd;
      System.out.println(lcm);
	}
}
