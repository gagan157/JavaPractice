package LeetCode.String;
import java.util.*;

public class Subset {
    public void solvesubset(int[] nums,int idx,List<Integer>output,List<List<Integer>>  ans){
        if(idx >= nums.length){
            ans.add(output);
            return;
        }
        
             
        //exclude
        solvesubset(nums,idx+1,output,ans);
        
        
        //include
        int element = nums[idx];
        output.add(element);
        solvesubset(nums,idx+1,output,ans);        
        
        
    }
    public List<List<Integer>> subsetss(int[] nums) {
       int idx = 0;
       List<List<Integer>> ans = new ArrayList<List<Integer>>();
       List<Integer> output = new ArrayList<Integer>();
        solvesubset(nums,idx,output,ans);
        
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> ans = subsetss(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans.get(i));
        }
    }
}