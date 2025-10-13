// find the second largest elm
import java.util.*;

public class FindSecLarg
{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		int ar[]={1,2,3,4,5,6,7,9};
		int max=0;
		int sec=0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]>max){
				sec=max;
				max=ar[i];
			}
			else if(ar[i]>sec && ar[i]!=max)
			{
				sec=ar[i];
			}
		}
		System.out.println(sec);
	}
}