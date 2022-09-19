package Recusrion;

public class checkSortedStikly {

    public static boolean SortedOrNot(int[] arr,int i) {
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] < arr[i+1]){
            return SortedOrNot(arr, i+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,4};
        boolean ans= SortedOrNot(arr,0);
        System.out.println(ans);
    }
}
