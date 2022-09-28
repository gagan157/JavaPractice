package Sorting;

/**
 * InnerSortingUsingMergeSort
 */

class MergeSort {

    public void mergeo(int[] arr,int s,int mid,int e) {
        int merged[] = new int[e - s + 1];
        // System.out.println(e - s + 1);
        // System.out.println("start "+ s);
        // System.out.println("mid "+ mid);
        // System.out.println("end "+ e);

        //love babber
        //len1 = mid-start +1;
        //len2 = end - mid;
    
        int idx1 = s;
        int idx2 = mid+1;

        int originalindx = 0;

        while (idx1 <= mid && idx2 <= e) {
            if(arr[idx1] <= arr[idx2]){

                merged[originalindx++] = arr[idx1++];

            }
            else{
                merged[originalindx++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[originalindx++] = arr[idx1++];
        }

        while (idx2 <= e) {
            merged[originalindx++] = arr[idx2++];
        }
        
       
        for (int i = 0,j = s; i < merged.length; i++,j++) {
            arr[j] = merged[i];
        }
    }

    public void divide(int[] arr,int start,int end) {
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;

        divide(arr, start, mid);

        divide(arr, mid+1, end);

        mergeo(arr, start,mid, end);
    }

    public void mSort(int arr[]) {
        divide(arr,0,arr.length-1);
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}

public class SortingUsingMergeSort {
    public static void main(String[] args) {
        int arr[] = {2,5,1,7,3,8};
        MergeSort mr = new MergeSort();
        mr.mSort(arr);
        mr.printArray(arr);
    }
}
