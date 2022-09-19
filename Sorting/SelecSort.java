package Sorting;


class SelectionSort {

    public void swap(int[] arr,int num1,int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
    public void sort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    swap(arr, i, j);
                }
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
        int arr[] = {3, 4, 2, 7, 8, 5};
        SelectionSort sr = new SelectionSort();
        sr.sort(arr);
        sr.printArray(arr);
    }
}
