package PracticeLoveBabberSheet.Arrays;

public class MoviesAllZeros {
    public static void moveAllZerosAtlast(int arr[],int n) {
        int j = 0;
        for (int i = 0; i <= n; i++) {
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }
        while (j<n) {
            arr[j++] = 0;
        }
    }

    public static void moveAllZerosAtBeg(int arr[],int n) {
        int count = 0;
        int j = n;
        for (int i = n; i >= 0 ; i--) {
            if(arr[i] == 0){
                count++;
            }
            else{
                arr[j--] = arr[i]; 
            }
            
        }
        int i=0;
        while (i < count) {
            arr[i++] = 0; 
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,0,4,0,4,0,5,0,0};
        moveAllZerosAtBeg(arr, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
