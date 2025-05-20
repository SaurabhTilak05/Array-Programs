// in array extract all last last digit form array and calculate sum 
import java.util.*;
public class ExtractAllLastDigitfromArrayCalSum
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int size=s.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			int rem=ar[i]%10;
			sum=sum+rem;
		}
		System.out.println("Sum is:  "+sum);
	}
}