/* Check if an array is sorted
Determine if the given array is sorted in ascending or descending order.
*/
import java.util.*;
public class CheckArAcDcSortOrNot
{
	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=s.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		boolean ascending=true;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				ascending=false;
				break;
			}
		}
		boolean descending=true;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]<ar[i+1])
			{
				descending=false;
				break;
			}
		}
		
		if(ascending)
		{
			System.out.println("Ascending Sorted Array");
		}
		else if(descending){
			System.out.println("Descinding Sort array");
		}
		else
		{
			System.out.println("Not Sorted Array");
		}
	}
}
