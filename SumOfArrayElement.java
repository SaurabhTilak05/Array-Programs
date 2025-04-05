/*
	Sum of elements in an array
	Calculate the sum of all elements in the array.
*/
import java.util.*;
public class SumOfArrayElement
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=s.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("Sum :"+sum);
	}
}