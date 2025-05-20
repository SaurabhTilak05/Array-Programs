import java.util.*;
public class FindLastDigCalSum
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
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		int	last=ar[ar.length-1];
		int temp=last;
		int sum=0;
		while(last!=0)
		{
			int rem=last%10;
			sum=sum+rem;
			last=last/10;
		}
		System.out.println("Last digit is:  "+temp+"and Sum is :   "+sum);
	}
}