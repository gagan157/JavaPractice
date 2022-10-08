package NewtonMock;

public class print {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" "); 
        }
    }
    public static void findMinK(int arr[],int k) {      
            int start = 0;
            int end = arr.length-1;
            int foundidex = -1;
            while (start <= end) {
                int mid = start + (end - start)/2;
                //if equal hai target than break
                if(arr[mid] == k){
                    foundidex = mid;
                    break;
                }
                //if mid element grater hai target se then  small elemnt return and start ko mid+1
                if(arr[mid] < k){
                    foundidex = mid;
                    start = mid+1;
                }
                if(arr[mid] > k){
                    end = mid-1;
                }
            }

            System.out.print(foundidex);

        }
        
        
    //counting sor
    //custom sort using lamda expression
    //binarry serach

    public static void main(String[] args) {
        int arr[] = {-1,-1, 5, 45, 56};
        int k = 60;
        findMinK(arr,k);
        // printarr(arr);
    }
}
