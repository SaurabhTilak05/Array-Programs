import java.util.*;
public class PermutationArray 
{
	public static void PrintArray(int[] a)
	{
		System.out.println("");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void getPermutation(int[] a,int n)
	{
		if(n==a.length-1)
		{
			PrintArray(a);
			return;
		}
		for(int i=n;i<a.length;i++)
		{
			swap(a, i, n);
			getPermutation(a ,n+1);
			swap(a, i, n);
		}
	}
	public static void swap(int[] a, int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int ar[]=new int[3];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		getPermutation(ar,0);
	}
}