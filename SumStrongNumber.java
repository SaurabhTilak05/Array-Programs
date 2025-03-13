import java.util.*;
public class SumStrongNumber {

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
