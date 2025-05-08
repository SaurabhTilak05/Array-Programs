/* Array Pair Sum
Description: Write a program to find all pairs in an array whose sum equals a given target.
Input: [1, 4, 5, 3, 2], target 6
Output: [(4, 2), (5, 1)]
*/

import java.util.*;
public class ArraySumPair
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr Array Size");
		int size=s.nextInt();
		System.out.println("Enetr Array Elements");
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter target value ");
		int target=s.nextInt();
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==target)
				{
					System.out.print(ar[i]+" "+ar[j]+",");
				}
			}
		}
	}
}
