package Recusrion;

public class FindLastOccurance {
    //option 2
    public static int flo(int arr[],int idx,int element) {
        if(idx == 0){
            return -1;
        }
        if(arr[idx] == element){
            return idx;
        }
        return flo(arr, idx-1, element);
    }

    //option 2
    public static int findLastOccIdx(int arr[],int idx,int element) {
        if(idx == arr.length){
            return -1;
        }        
        int collectIdx = findLastOccIdx(arr, idx+1,element);

        if(collectIdx == -1){
            if(arr[idx] == element){
                return idx;
            }
            else{
                return -1;
            }
        }
        else
            return collectIdx;

    }
    public static void main(String[] args) {
        int arr[] = {4,4,4,5,2,4,2,6};
        int ans = findLastOccIdx(arr, 0, 4);
        System.out.println(ans);
    }
}
