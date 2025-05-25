/*	Move All Zeros to the End
	Question:
	Given an array, move all 0s to the end while maintaining the order of non-zero elements.
	Example:
	Input: [0, 1, 0, 3, 12] → Output: [1, 3, 12, 0, 0]
	Explanation:
	Use two passes: one to collect non-zero elements and another to append zeros.
*/

import java.util.*;
public class MoveZerosEnd
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int ar[]=new int[6];
		System.out.println("Enter Array Elments ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int a=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				ar[a]=ar[i];
				a++;
			}
		}
		while(a<ar.length)
		{
			ar[a]=0;
			a++;
			
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}