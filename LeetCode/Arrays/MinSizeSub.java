package LeetCode.Arrays;

public class MinSizeSub {
    public static int minSizeSubArray(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        
        int l = 0;
        int r = 0;
        
        int sum = 0;
        while(r<nums.length){
            sum+=nums[r];
            if(sum >= target){
                while (sum>=target) {
                    sum-= nums[l];
                    l++;
                }
                min = Math.min(r-l+2, min);
            }  
            r++;             
        }
        return min==Integer.MAX_VALUE?0:min;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target = 11;
        System.out.println(minSizeSubArray(target, arr)); 
    }
}
