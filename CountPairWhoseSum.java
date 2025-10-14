/* Problem:
Count all pairs in an array whose sum is equal to a given number.
Input: arr = [1, 5, 7, -1, 5], sum = 6
Output: 3 (pairs: (1,5), (7,-1), (1,5))
*/

import java.util.*;
public class CountPairWhoseSum
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements:    ");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++){
			ar[i]=s.nextInt();
		}
		System.out.println("Enter target");
		int sum=s.nextInt();
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==sum)
				{
					System.out.println("("+ar[i]+" "+ar[j]+")");
				}
			}
		}
	}
}