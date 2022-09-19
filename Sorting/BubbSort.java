package Sorting;

/**
 * InnerBubbSort
 */
// 5 7 3 2 9 2
class BubbleSort {
    public void swap(int[] arr , int num1,int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public void sort(int[]arr) {
        boolean sorted = false;        
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                    sorted = true;
                }
            }
            if(sorted == false){
                break;
            }
        }
    }
    
    public void printArray(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


public class BubbSort {
    public static void main(String[] args) {
        int [] arr = {2,1};
        BubbleSort bs = new BubbleSort();
        bs.sort(arr);
        bs.printArray(arr);
    }
}
