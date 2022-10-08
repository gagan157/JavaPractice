package LeetCode.String;
import java.util.*;

public class Subset {
    public static void solvesubset(int[] nums,int idx,List<Integer> output,List<List<Integer>>  ans){
        if(idx >= nums.length){
            ans.add(output);
            
            return;
        }
        
             
        //exclude
        solvesubset(nums,idx+1,output,ans);        
        //include
        // List<Integer> newoutput = new ArrayList<>();
        int element = nums[idx];
        output.add(element);
        solvesubset(nums,idx+1,output,ans);   
             
        output.remove(output.size()-1);
        
        
    }
    public static List<List<Integer>> subset(int[] nums) {
       int idx = 0;
       List<List<Integer>> ans = new ArrayList<List<Integer>>();
       List<Integer> output = new ArrayList<Integer>();
        solvesubset(nums,idx,output,ans);
        
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
