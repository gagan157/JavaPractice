package Recusrion;

public class BinaryWithRecussion {
    public static Boolean isSorted(int arr[],int idx) {
        if(idx == arr.length){
            return true;
        }
        
        if(arr[idx] < arr[idx-1]){
            return false;
        }

        return isSorted(arr, idx+1);

    }
    public static int findLesserThanKey(int arr[],int key,int s ,int e) {
        if(key < arr[0]){
            return -1;
        }
        else if(s > e){
            return arr[e];
        }

        int mid = s+(e-s)/2;
        if(arr[mid] == key){
            return arr[mid];
        }        
        else if(key > arr[mid]){
            return findLesserThanKey(arr, key, mid+1, e);
            
        }
        else{
            return findLesserThanKey(arr, key, s, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,9,10,15};
        // System.out.println(isSorted(arr,1));
        System.out.println(findLesserThanKey(arr,18,0,arr.length-1));
    }   
}
