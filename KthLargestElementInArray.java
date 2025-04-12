/*
	Find the "Kth" largest element in an array
	Given an array, find the Kth largest element using an efficient method
*/
import java.util.*;
public class KthLargestElementInArray
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=s.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter K Value");
		int k=s.nextInt();
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		if(k>0 && k<=ar.length)
		{
			System.out.println("Kth Largest Element is:"+ar[ar.length-k]);
		}
	}
}