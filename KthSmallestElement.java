/*
	Find the "Kth" smallest  element in an array
	Given an array, find the Kth samallest element using an efficient method
	
*/	
import java.util.*;
public class KthSmallestElement
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int ar[]=new int[6];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter kth Value");
		int k=s.nextInt(); 
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		if(k>0 && k<=ar.length)
		{
			System.out.println("Kth Samllest Element is:"+ar[ar.length-k]);
		}
		
	}
}