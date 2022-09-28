package Recusrion;

public class FindLastOccurance {
    public static int flo(int arr[],int idx,int element) {
        if(idx == 0){
            return -1;
        }
        if(arr[idx] == element){
            return idx;
        }
        return flo(arr, idx-1, element);
    }
    public static void main(String[] args) {
        int arr[] = {4,4,4,5,2,4,4};
        int ans = flo(arr, arr.length-1, 4);
        System.out.println(ans);
    }
}
