/*Problem:
Replace First and Last Element with 0.
Input: [5, 3, 7, 2]
Output: [0, 3, 7, 0]
*/

import java.util.*;
public class ReplaceFirstAndLastElmByk
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
		ar[0]=k;
		ar[ar.length-1]=k;
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}