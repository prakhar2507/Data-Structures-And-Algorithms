import java.util.Scanner;

public class FindPivotIndexSol2 {
    public int pivotIndex(int[] nums){
        int n=nums.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            if(leftSum==totalSum-leftSum-nums[i]) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FindPivotIndexSol2 object = new FindPivotIndexSol2();
        int nums[]={1,7,3,6,5,6};
        int ans=object.pivotIndex(nums);
        System.out.println("Pivot Index : "+ans);
        sc.close();
    }
}
