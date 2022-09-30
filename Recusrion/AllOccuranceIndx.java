package Recusrion;



public class AllOccuranceIndx {
    public static int[] indeceArray(int arr[],int idx,int element,int count) {
        if(idx == arr.length){
            return new int[count];
        }
        if(arr[idx] == element){
            count++;
        }
        int iarra[] = indeceArray(arr, idx+1, element, count);
        if(arr[idx] == element){
            iarra[count-1] = idx;
        }
        return iarra;        
       
    }
    public static void main(String[] args) {
        int arr[] = {4,4,4,5,2,4,4};
        
        int idxlist[] = indeceArray(arr, 0,4,0);

        for (int i = 0; i < idxlist.length; i++) {
            System.out.print(idxlist[i]+" ");
        }
    }
}
