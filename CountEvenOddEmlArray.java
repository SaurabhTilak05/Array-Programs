/*
	Find the number of even and odd numbers in an array
	Count how many even and odd numbers are in an array.
*/
import java.util.*;
public class CountEvenOddEmlArray
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size=s.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int ecount=0;
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				ecount++;
			}
			else{
				count++;
			}
		}
		System.out.println("Even Number Count is:"+ecount);
		System.out.println("Odd Number Count is:"+count);
		
	}
	
}