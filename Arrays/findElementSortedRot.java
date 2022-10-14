package Arrays;

public class findElementSortedRot {
    public static int findPivot(int arr[]) {
       if(arr[0] < arr[arr.length-1]){
            return 0;
       }

       int start = 0;
       int end = arr.length-1;

       while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                return mid+1;
            }
            if(arr[mid] < arr[mid-1]){
                return mid;
            }
            if(arr[start] > arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
       }
       return -1;
    }
    public static int searchSortedRotated(int arr[],int key){
        int pivotMid = findPivot(arr);
        
        int start = key >= arr[0]? 0 : pivotMid;        
        int end = key >= arr[0]? pivotMid : arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] <= key){
                start = mid+1;
            }
            else{
                 end = mid-1;
            }
        }        
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 1;
        searchSortedRotated(arr,key);
    }
}
