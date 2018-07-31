/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void sort(int[] a,int low,int high)
	{
		int N=high-low;
		if(N<=1)
		{
			return;
		}
		int mid=low+N/2;
		sort(a,low,mid);
		sort(a,mid,high);
		int[] temp=new int[N];
		int i=low,j=mid;
		for(int k=0;k<N;k++)
		{
			if(i==mid)
			{
				temp[k]=a[j++];
			}
			else if(j==high)
			{
				temp[k]=a[i++];
			}
			else if(a[j]<a[i])
			{
				temp[k]=a[j++];
			}
			else
			{
				temp[k]=a[i++];
			}
		}
		for(int k=0;k<N;k++)
		{
			a[low+k]=temp[k];
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Sc=new Scanner(System.in);
		int n,i;
		n=Sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=Sc.nextInt();
		}
		sort(arr,0,n);
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+"\t");
		}
	}
}
