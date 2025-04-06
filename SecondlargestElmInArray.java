/*
	Find the second largest element in an array
	Find the second largest element in an unsorted array.
*/
import java.util.*;
public class SecondlargestElmInArray
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
		int larg=ar[0];
		int sec=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>larg)
			{
				sec=larg;
				larg=ar[i];
			}
			else if(ar[i]>sec && ar[i]<larg)
			{
				sec=ar[i];
			}
		}
	System.out.println("Second large is:"+sec);
	}
}