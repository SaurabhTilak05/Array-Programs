/* Write a program in java to find the smallest missing element from a sorted array?
		Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/

import java.util.*;
public class FindMissingElm
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements:    ");
		int ar[]=new int[8];
		for(int i=0;i<ar.length;i++){
			ar[i]=s.nextInt();
		}
		for(int i=0;i<ar.length-1;i++){
			for(int j=ar[i]+1;j<ar[i+1];j++){
				System.out.println(""+j);
				break;
			}
		}
	}
}