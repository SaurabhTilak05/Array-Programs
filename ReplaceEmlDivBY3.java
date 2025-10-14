/*Problem:
Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]
*/


import java.util.*;
public class ReplaceEmlDivBY3
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements:    ");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++){
			ar[i]=s.nextInt();
		}
		System.out.println("Enter Replace element ");
		int k=s.nextInt();
		for(int i=0;i<ar.length;i++){
			if(ar[i]%3==0)
			{
				ar[i]=k;
			}
		}
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}
}