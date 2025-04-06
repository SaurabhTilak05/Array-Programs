/*
	Move all negative numbers to the beginning
	Rearrange the array such that all negative numbers are moved to the front.
*/
import java.util.*;
public class MoveNegativeNumberToFront
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter size of Array");
		int size=s.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				if(i!=j)
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				j++;
			}
			
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}