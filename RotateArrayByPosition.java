/*
	15. Rotate Array by N Positions
	Description: Rotate the array by n positions to the right.
	Input: [1, 2, 3, 4, 5], n = 2
	Output: [4, 5, 1, 2, 3]
*/
import java.util.*;
public class RotateArrayByPosition
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter Position ");
		int p=s.nextInt();
		for(int i=p;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}		
		for(int i=0;i<p;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}