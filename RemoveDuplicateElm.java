

import java.util.*;
class RemovingDup {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int k=0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[k])
            {
                     k++;
                nums[k]=nums[i];
           
            }
        }
        return k+1;
    }
}
public class RemoveDuplicateElm{
    public static void main(String x[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements");
        int ar[]=new int[6];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }
        Arrays.sort(ar);
        RemovingDup sol=new RemovingDup();
       int result=sol.removeDuplicates(ar);
       System.out.println("After Remove duplicate elements:  ");
       for(int i=0;i<result;i++)
       {
            System.out.print(ar[i]+" ");
       }
    }
}
