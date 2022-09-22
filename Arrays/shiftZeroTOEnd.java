package Arrays;
// import Arrays.RemoveAllDuplicates;

public class shiftZeroTOEnd {

    public static void solutiion(int arr[]) {

        int n =arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while (count<n) {
            arr[count++] = 0;
        }
    }


    public static void solutionmovetoend(int arr[]) {
       
        for (int i = 0; i < arr.length && arr[0] == 0 ; i++) {    
           

                int temp = arr[i];
                int size = arr.length-1;
                for (int j = 1; j < arr.length; j++) {
                    //shifting
                    arr[j-1] = arr[j];
                    
                    //end position pr zero place karna
                    if(j == size-i)  {
                        arr[size-i] = temp;
                    }               
                }
                
              
        }
        
    }
    public static void main(String[] args) {
        int arr [] = {0,0,0,0,3,65,0,3,70,0};
        solutiion(arr);        
        RemoveAllDuplicates.printArray(arr, arr.length);

    }
}
