/*Q1. Problem: Given an array of integers and a number k, find the maximum sum of any k consecutive elements.
Example Input: arr = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4 
Output: 39 (10+23+3+1)
*/
import java.util.*;
public class KthMaxSum{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int ar[]={1, 4, 2, 10, 23, 3, 1, 0, 20};
		System.out.println("Enter k th Value");
		int k=s.nextInt();
		int maxSum=0;
		int wSum=0;
		for(int i=0;i<k;i++)
		{
			wSum+=ar[i];
		}
		maxSum=wSum;
		for(int i=k;i<ar.length;i++){
			wSum+=ar[i]-ar[i-k];
			if(wSum>maxSum){
				maxSum=wSum;
			}
		}
		System.out.println("Max Sum is:   "+maxSum);
	}
}