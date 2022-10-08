package Sorting;



public class Allsorting {
    public static void printSortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
           int curntele = arr[i];      
           int j = i-1;
           while (j >= 0) {
                if(curntele < arr[j]){
                    arr[j+1] = arr[j];   
                    j--;
                }
                else{
                    break;
                }
           }
           arr[j+1] = curntele;
        }
    }

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubblesort(int arrr[]) {
        boolean swaped = false;
        for (int i = 1; i < arrr.length-1; i++) {
            for (int j = 1; j < arrr.length; j++) {
                if(arrr[j-1] > arrr[j]){
                    swap(arrr, j-1, j);
                    swaped = true;
                }
            }
            if(swaped == false){
                break;
            }
        }
    }

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int currsmal = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[currsmal]){
                    currsmal = j;
                }
            }
            if(arr[currsmal] < arr[i]){
                swap(arr, i, currsmal);
            }
        }
    }

    public static void mergearray(int arr[], int start,int mid,int end) {
        int newmergearray[] = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid+1;

        int ogidx = 0;

        while (idx1 <= mid && idx2 <= end) {
            if(arr[idx1] <= arr[idx2]){
                newmergearray[ogidx++] = arr[idx1++];
            }
            else{
                newmergearray[ogidx++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            newmergearray[ogidx++] = arr[idx1++];
        }

        while (idx2 <= end) {
            newmergearray[ogidx++] = arr[idx2++];
        }

        int arridx = start;
        for (int i = 0; i < newmergearray.length; i++) {
            arr[arridx++] = newmergearray[i];
        }
    }

    public static void dividearray(int arr[],int start,int end) {
        if(start >= end){
            return;
        }
        int mid = start + (end - start) /2;
        dividearray(arr, start, mid);

        dividearray(arr, mid+1, end);

        mergearray(arr,start,mid,end);
    }

    public static void mergesort(int arr[]) {
        dividearray(arr,0,arr.length-1);
    }

    public static int psort(int arr[],int start,int end) {
        int pivo = arr[start];
        int count = 0;
        for (int i = start+1; i <= end; i++) {
            if(arr[i] <= pivo){
                count++;                
            }
        }
        
        int pivotindx = start + count;
        swap(arr, start, pivotindx);
        
        // System.out.println("pivot= "+pivo+", start= " +start + ", pindx= " + pivotindx+", pivotele= "+ arr[pivotindx]); 

        int idxs = start;
        int  idxe = end;

        while (idxs < pivotindx && idxe > pivotindx) {
            while (arr[idxs] <= pivo) {
                idxs++;
            }
            while (arr[idxe] > pivo) {
                idxe--;
            }

            if(idxs < pivotindx && idxe > pivotindx){
                swap(arr, idxs, idxe);

                idxs++;
                idxe--;
            }
        }

        return pivotindx;       

    }

    public static void qp(int arr[],int start,int end) {
        if(start>=end){
            return;
        }
            
            int pivot = psort(arr,start,end);
            
            qp(arr, start, pivot-1);
            
            qp(arr, pivot+1, end);
    }
    public static void qiukesort(int arr[]) {
        qp(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {10, 80, 30, 90, 40, 50, 70};
        // insertionsort(arr);
        // bubblesort(arr);
        // selectionsort(arr);
        // mergesort(arr);
        qiukesort(arr);
        printSortedArray(arr);
    }
}
