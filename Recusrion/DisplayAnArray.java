package Recusrion;

public class DisplayAnArray {
    public static void pAnArrayArrcending(int arr[], int idx) {
        if(idx == -1){
            return;
        }
        pAnArrayArrcending(arr, idx-1);
        System.out.print(arr[idx]+" ");
    }
    public static void pAnArrayDecending(int arr[],int idx) {
        if(idx == -1){
            return;
        }
        System.out.print(arr[idx]+" ");
        pAnArrayDecending(arr, idx-1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        pAnArrayArrcending(arr, 5-1);
        System.out.println();
        pAnArrayDecending(arr, 5-1);
    }
}
