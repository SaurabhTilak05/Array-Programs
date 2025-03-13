/*
	Q1.Median of two Sorted Arrays of Different Sizes
	Given two sorted arrays, a[] and b[], the task is to find the median of these sorted arrays. Assume that the two sorted arrays are merged and then median is selected from the combined array.

	Q1.Median of two Sorted Arrays of Different Sizes
	Examples: 
	Input: a[] = [-5, 3, 6, 12, 15], b[] = [-12, -10, -6, -3, 4, 10]
	Output: 3
	Explanation: The merged array is [-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15]. 
	So the median of the merged array is 3.

	Input: a[] = [1, 12, 15, 26, 38], b[] = [2, 13, 17, 30, 45, 60]
	Output: The median is 11.
	Explanation : The merged array is [1, 2, 12, 13, 15, 17, 26, 30, 38, 45, 60]. 
	So the median of the merged array is 17.

	Input: a[] = [], b[] = [2, 4, 5, 6]
	Output: The median is 4.5
	Explanation:The merged array is [2, 4, 5, 6]. The total number of elements are even,
	 so there are two middle elements. Take the average between the two: (4 + 5) / 2 = 4.5

	Your Task : you have to create class name as Median with constructor and some methods given below 
	Median(int a[],int b[]): this constructor help us to accept two array as parameter 
	float getMedian(): this function can find the median of an array and return its result.
*/

import java.util.*;
public class FindMidianOfTwoMargeArray
{
	private int a[];
	private int b[];
	FindMidianOfTwoMargeArray(int a[], int b[])
	{
		this.a=a;
		this.b=b;
	}
	float getMedian()
	{
		int c[]=new int[a.length + b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=i;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		if(c.length%2==0)
		{
			int mid1=(c.length/2)-1;
			int mid2=c.length/2;
			return ((c[mid1]+c[mid2])/2.0f);
		}
		else{
			int mid=c.length/2;
			return (mid);
		}
	}
	
	public static void main(String x[])
	{
		Scanner s=new Scanner (System.in);
		int a[]=new int[5];
		System.out.println("Enter First Array Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=new int[6];
		System.out.println("Enter Second Array Elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		FindMidianOfTwoMargeArray fm =new FindMidianOfTwoMargeArray( a, b);
		System.out.println("mid is:"+fm.getMedian());
	}
	
}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number");
		int no=s.nextInt();
			System.out.println(sumOfStrong(no));
	}
		public static int isFact(int no)
		{
			int fact=1;
			for(int i=1;i<=no;i++)
			{
				fact=fact*i;
			}
			return fact;
		}
		public static boolean isStrong(int no)
		{
			int temp=no;
			int sum=0;
			while(no>0)
			{
				int rem=no%10;
				sum=sum+isFact(rem);
				no=no/10;
			}
			return sum==temp;
		}
		public static int sumOfStrong(int no)
		{
			int sum=0;
			for(int i=0;i<=no;i++)
			{
				if(isStrong(i))
				{
					sum=sum+i;
				}
			}
			return sum;
		}

}
