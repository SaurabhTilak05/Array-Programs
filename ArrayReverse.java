/* Reverse an array
Reverse the elements of an array in place.
*/
import java.util.*;
public class ArrayReverse
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
		for(int i=0;i<ar.length/2;i++)
		{
			int temp=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=temp;
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	
}