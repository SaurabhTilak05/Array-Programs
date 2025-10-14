/*Problem:
Replace all negative numbers in the array with 0.
Input: [2, -3, 4, -1, 5]
Output: [2, 0, 4, 0, 5]
*/


import java.util.*;
public class ReplaceNegNumToZero
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements:    ");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++){
			ar[i]=s.nextInt();
		}
		for(int i=0;i<ar.length;i++){
			if(ar[i]<0){
				ar[i]=0;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
}