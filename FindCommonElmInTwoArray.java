/* 
	Find the Common Elements in Two Arrays
	Description: Find the common elements between two arrays.
	Input: [1, 2, 3, 4], [3, 4, 5, 6]
	Output: [3, 4]
*/
import java.util.*;
public class FindCommonElmInTwoArray
{
	public static void main(String x[])
	{
		Scanner s=new Scanner (System.in);
		int ar[]=new int[5];
		System.out.println("Enter First Array Elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int a[]=new int[5];
		System.out.println("Enter First Array Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Common Elements :");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(ar[i]==a[j])
				{
					System.out.print(ar[i]+" ");
				}
			}
		}
	}
}