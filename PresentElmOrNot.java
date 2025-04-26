/*
	Check if Array Contains a Specific Element
	Description: Check if a specific element exists in an array.
	Input: [1, 2, 3, 4], element 3
	Output: Found
*/
import java.util.*;

public class PresentElmOrNot
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int ar[]=new int[6];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter Element to search");
		int elm=s.nextInt();
		boolean b=false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==elm)
			{
				b=true;
			}
		}
		if(b)
		{
			System.out.println("Element found");
		}
		else{
			System.out.println("Element Not found");
		}
		
	}	
}