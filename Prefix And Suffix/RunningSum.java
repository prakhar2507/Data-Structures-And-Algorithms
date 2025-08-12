

import java.util.Scanner;

public class RunningSum {

    public int[] runningSum(int[] nums){
        if(nums.length<=1) return nums;
        int n=nums.length;
        int[] res=new int[n];
        res[0]=nums[0];
        for(int i=1;i<n;i++){
            res[i]=res[i-1]+nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        RunningSum obj=new RunningSum();
        int[] nums={1,2,3,4};
        int[] ans=obj.runningSum(nums);

        System.out.print("Output: ");

        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();

        sc.close();
    }
}
