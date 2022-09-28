package Recusrion;

public class FindFirstOccurance {
    public static int ffo(int arr[],int idx,int element) {
        if(element == arr[idx]){
            return idx;
        }
        if(idx == arr.length-1){
            return -1;
        }
        return ffo(arr, idx+1, element);
    }
    public static void main(String[] args) {
        int arr[] = {4,4,4,5,2,4,7};
        int ans = ffo(arr, 0, 4);
        System.out.println(ans);
    }
}
