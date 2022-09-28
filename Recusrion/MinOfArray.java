package Recusrion;

public class MinOfArray {
    public static int min(int arr[],int idx) {
        if(idx == 0){
            return arr[idx];
        }
        int mini = min(arr, idx-1);
        if(arr[idx] < mini){
            mini = arr[idx];
        }
        return mini;
    }
    public static void main(String[] args) {
        int arr[] = {12,1143,1100,7,23,160};
        int ans = min(arr, arr.length-1);
        System.out.println(ans);
    }
}
