
import java.util.*;
public class FrequencyOfanEMl
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr Array Elements");
		int ar[]=new int[7];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter Digit to cal frequency");
		int dig=s.nextInt();
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==dig)
			{
				count++;
			}
		}
		System.out.println(dig+"\tFrequency is:\t"+count);
		
	}
}