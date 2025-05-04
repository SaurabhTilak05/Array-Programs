import java.util.*;
public class CheckPalimOrNot
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
		boolean b=true;
		for(int i=0;i<ar.length/2;i++)
		{
			if(ar[i]!=ar[ar.length-1-i])
			{
				b=false;
				break;
			}
		}
		if(b)
		{
			System.out.println("Is Palindrome");
		}
		else{
			System.out.println("Is Not Palindrome");
		}
	}
}
















/*


let ar=[1, 2, 3, 2, 1];
let isPalim=true;
for(let i=0;i<parseInt(ar.length/2);i++)
{
	if(ar[i]!==ar[ar.length-1-i])
	{
		isPalim=false;
		break;
	}
}
if(isPalim)
{
	console.log("Palindrome");
}
else{
	console.log("Not Palindrome");
}
*/