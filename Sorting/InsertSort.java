package Sorting;

//3, 2, 4, 7, 8, 1


class InsertionSort {
    public void printArray(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public void sort(int[]arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
           while (j >= 0 && temp < arr[j]) {
                
                arr[j+1] = arr[j];                
                j--;
           }
           arr[j+1] = temp;
        }
    }
}

public class InsertSort {
    public static void main(String[] args) {
        int arr[]= {3, 4, 2, 7, 8, 1};
        InsertionSort in = new InsertionSort();
        in.sort(arr);
        in.printArray(arr);
    }
}
