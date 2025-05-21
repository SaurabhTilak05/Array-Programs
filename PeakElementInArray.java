//Find Peak Element - An element is a peak if it is greater than or equal to its neighbors.
import java.util.*;
public class PeakElementInArray
{
	public static int PeakElement(int ar[])
	{
		int c=0;
		for(int i=1;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1] && ar[i]>ar[i-1]){
				c=i;
				return c;
			}
		}
		if(ar[0]>ar[ar.length-1])
		{
			c=0;
		}
		else{
			c=ar.length-1;
		}
		return c;
	}
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int ar[]=new int[6];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int result=PeakElement(ar);
		System.out.println(result);
	}
}