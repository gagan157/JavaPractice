package Arrays;

import java.util.*;

public class SubArrayWithGivenSum {
    static void subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        int i = 0;
        int j = i;
        
        int sum = 0; 
        while(i < n){
            
            sum += arr[j];
            
            if(sum == s){
                ar.add(i+1);
                ar.add(j+1);
                break;
            }
            
            if(arr[j] > s || j == n-1){
                i++;
                sum = 0;
                j = i;
            }
            else{
                j++;
            }
        }
        
        for (int k = 0; k < ar.size(); k++) {
            
            System.out.print(ar.get(k)+" ");
        }
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,7,8,9,10};
        subarraySum(arr, 10, 15);
    }
}
