package Recusrion;



public class MaxOfArray {
    public static int moa(int arr[],int idx) {
        if(idx == -1){
            return Integer.MIN_VALUE;
        }
        int maxi =  moa(arr, idx-1);
        if(arr[idx] > maxi){
            maxi = arr[idx];
        }
        return maxi;        
    }
    public static int moa2(int arr[],int idx) {
        if(idx == 0){
            return arr[idx];
        }
        
        int maxi =  moa2(arr, idx-1);
        if(arr[idx] > maxi){
            maxi = arr[idx];
        }
        return maxi;        
    }
    public static void main(String[] args) {
        int arr[] = {12,1143,1100,7,23,160};
        // int ans = moa(arr,arr.length-1);
        int ans = moa2(arr,arr.length-1);
        System.out.println(ans);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
