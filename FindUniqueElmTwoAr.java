// find the unique elements in two array 
import java.util.*;
public class FindUniqueElmTwoAr
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int ar[]= {1,2,3,4};
		int ar2[]= {2,4,5,6,7};
		int size=ar.length+ar2.length;
		int c[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			c[i]=ar[i];
		}
		for(int i=0;i<ar2.length;i++)
		{
			c[ar.length+i]=ar2[i];
		}
		
		
		boolean b[]=new boolean[size];
		
		for(int i=0;i<size;i++){
			if(!b[i])
			{
				for(int j=i+1;j<size;j++)
				{
					if(c[i]==c[j]){
						b[i]=true;
						b[j]=true;
					}
				}
			}
		}
		System.out.println("Unique elements:");
		for(int i=0;i<size;i++)
		{
			if(!b[i]){
				System.out.print(c[i]+" ");
			}
		}
	}
}