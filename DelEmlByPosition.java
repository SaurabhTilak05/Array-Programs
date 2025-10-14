 /*	Write a program in java to delete an element at desired position from an array.
	Test Data :
	Input the size of array : 5
	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	Input the position where to delete : 3
	Expected Output: The new list is : 1 2 3 5
*/
import java.util.*;
public class DelEmlByPosition
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements:    ");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++){
			ar[i]=s.nextInt();
		}
		System.out.println("Enter position");
		int k=s.nextInt();
		boolean b[]=new boolean[ar.length];
		for(int i=0;i<ar.length;i++){
			if(i==k){
				b[i]=true;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(!b[i])
			{
				System.out.print(ar[i]+" ");
			}
		}
	}
}