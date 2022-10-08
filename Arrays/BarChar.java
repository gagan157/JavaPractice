package Arrays;

public class BarChar {
    public static void printBarChar(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int row = max;
        int col = arr.length-1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= col; j++) {
                if(arr[j] >= max-i){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print(" "+i);            
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,0,7,5};
        printBarChar(arr);
    }
}
