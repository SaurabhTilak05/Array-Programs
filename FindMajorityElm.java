/*
2) 	Find Majority Element in an Array
	Write a Java program that checks if a given number appears more than n/2 times in 
	an array, where n is the array size.
*/
import java.util.*;
public class FindMajorityElm
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int ar[]= new int[8];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter A number to Check ");
		int number=s.nextInt();
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==number)
			{
				count++;
			}
		}
		if(count>ar.length/2)
		{
			System.out.println(number+"\tMajority Element Array "+ar.length/2+":\tTime ");
		}
		else{
			System.out.println("Not Majority Element Array");
		}
	}
}