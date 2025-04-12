/*
	Count occurrences of an element in an array
	Find how many times a given number appears in the array.
*/
import java.util.*;
public class OccurrenceCountEmlAr
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
		boolean b[]=new boolean[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			if(b[i]==false)
			{
			int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					b[j]=true;
					count++;
				}
			}
			System.out.println(ar[i]+".....>"+count);
			}
		}
		
	}
	
}