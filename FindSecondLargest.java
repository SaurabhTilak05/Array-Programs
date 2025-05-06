import java.util.*;
public class FindSecondLargest
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr Array Elements");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int larg;
		int secl;
		if(ar[0]>ar[1])
		{
			larg=ar[0];
			secl=ar[1];
		}
		else{
			larg=ar[1];
			secl=ar[0];
		}
		for(int i=2;i<ar.length;i++)
		{
			if(ar[i]>larg)
			{
				secl=larg;
				larg=ar[i];
			}
			else if(ar[i]>secl && ar[i]<larg)
			{
				secl=ar[i];
			}
		}
		if(larg==secl)
		{
			System.out.println("No distinct second largest value found...!!");
		}
		else{
			System.out.println("Second Large is:"+secl);
		}
	}
}