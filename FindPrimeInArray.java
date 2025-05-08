// Find prime number in array
import java.util.*;
public class FindPrimeInArray
{
	public static boolean isPrime(int no)
	{
		if(no<=1)
		{
			return false;
		}
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr Array Size");
		int size=s.nextInt();
		int ar[]=new int[size];
		System.out.println("Enetr Array Elemenets");
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		
		
		for(int i=0;i<ar.length;i++)
		{
			if(isPrime(ar[i]))
			{
				System.out.print(ar[i]+" ");
			}
		}
	}
}