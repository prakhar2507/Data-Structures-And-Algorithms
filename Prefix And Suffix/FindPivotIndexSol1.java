import java.util.Scanner;

public class FindPivotIndexSol1 {
    public int pivotIndex(int[] nums){
        int n=nums.length;
        int prefix[] =new int[n];
        int suffix[]=new int[n];
        prefix[0]=0;
        suffix[n-1]=0;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(prefix[i]==suffix[i]) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FindPivotIndexSol1 object=new FindPivotIndexSol1();
        int nums[]={1,7,3,6,5,6};
        int ans=object.pivotIndex(nums);
        System.out.println("Pivot Index : "+ans);
        sc.close();
    }
}
