/*
	Check if an array contains duplicate elements
	Check if the given array contains any duplicate values.
*/
import java.util.*;
public class DuplicateElement
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
		boolean b=true;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					b=false;
					break;
				}
			}
		}
		if(b)
		{
			System.out.println("Not A Duplicate Element In Array");
		}
		else{
			System.out.println("Duplicate element in array");
		}
	}
}