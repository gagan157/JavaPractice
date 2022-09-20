package Sorting;


class SelectionSortss {

    public void swap(int[] arr,int num1,int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
    public void sort(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(arr[min] < arr[i]){
                swap(arr, i, min);
            }
        }
    }
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}


public class SelecSort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 7, 8, 1};
        SelectionSortss sc = new SelectionSortss();
        sc.sort(arr);
        sc.printArray(arr);
    }
}
