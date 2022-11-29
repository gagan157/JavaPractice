package Recusrion;

public class Sorting {
    public static void swap(int arr[],int idxa,int idxb) {
        int temp = arr[idxa];
        arr[idxa] = arr[idxb];
        arr[idxb] = temp;
    }
    public static void SolutionbuubleSort(int arr[],int i) {
        if(i == arr.length){
            return;
        }
        boolean sorted = false;
        for (int j2 = 1; j2 < arr.length; j2++) {
            if(arr[j2] < arr[j2 - 1]){
                swap(arr, j2-1, j2);
                sorted = true;
            }            
        }
        if(sorted != false)
        SolutionbuubleSort(arr, i+1);
    }
    public static void SolutionbuubleSort2(int arr[],int i,int j) {
        if(i == arr.length)
            return;

        boolean sorted = false;
        
        if(j < arr.length){
            if(arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                sorted = true;
            }
            SolutionbuubleSort2(arr,i,j+1);
        }
        
        if(sorted != false)
            SolutionbuubleSort2(arr, i+1, 1);
    }

    public static void solutionSelectionSort(int arr[],int i) {
        if(i == arr.length-1){
            return;
        }
        int min = i;
        int j = i+1;
        for (; j < arr.length; j++) {
            if(arr[j] < arr[min]){
                min = j;
            }
        }
        swap(arr, i, min);
        solutionSelectionSort(arr, i+1);
    }

    public static void solutionSelectionSort2(int arr[],int i,int j,int min) {
        if(i == arr.length-1){
            return;
        }
        if(j < arr.length){
            if(arr[j] < arr[min])                
                solutionSelectionSort2(arr, i, j+1, j);            
            else
                solutionSelectionSort2(arr, i, j+1, min);
        }
        swap(arr, i, min);
        solutionSelectionSort2(arr, i+1, j+1, i+1);
    }

    public static void SolutionInsertionSort(int arr[],int i) {
        if(i == arr.length){
            return;
        }
        int temp = arr[i];
        int j = i-1;
        while (j>=0) {
            if(temp < arr[j]){
                arr[j+1] = arr[j];
                j--; 
            }
            else    
                break;
        }
        arr[j+1] = temp;
        SolutionInsertionSort(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {5,2,5,0,6,4,9,7};
        // SolutionbuubleSort(arr, 1);
        // SolutionbuubleSort2(arr, 1, 1);
        // solutionSelectionSort(arr, 0);
        // solutionSelectionSort2(arr, 0, 1, 0);
        SolutionInsertionSort(arr, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
