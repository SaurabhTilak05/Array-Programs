/*
	Replace Each Element with Product of All Other Elements
	Question:
	 Given an array, return a new array where each element is the product of all other elements.
	 Example:
	 Input: [1, 2, 3, 4] → Output: [24, 12, 8, 6]
	Explanation:
	 Use nested loops or compute total product and divide for each index (except when 0 is present).
*/

import java.util.*;
public class EachElmAllProdElm
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int ar[]=new int[4];
		 System.out.println("Enert Array Elements");
		 for(int i=0;i<ar.length;i++)
		 {
			 ar[i]=s.nextInt();
		 }
		 int total=1;
		 for(int i=0;i<ar.length;i++)
		 {
			 total=total*ar[i];
			// System.out.println(total);
		 }
		int a[]=new int[ar.length];
		for(int i=0;i<ar.length;i++){
			a[i]=total/ar[i];
		}
		System.out.print("All Elements Products are:  ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
