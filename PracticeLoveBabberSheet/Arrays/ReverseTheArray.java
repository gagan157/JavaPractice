package PracticeLoveBabberSheet.Arrays;

public class ReverseTheArray {
    public static void printreverseArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseTheArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            //formula
           /* 
            x = x + y
            y = x - y
            x = x - y 
            */

           arr[start] = arr[start] + arr[end];
           arr[end] = arr[start] - arr[end];
           arr[start] = arr[start] - arr[end];

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] ={4, 5, 1, 2};
        reverseTheArray(arr);
        printreverseArray(arr);
    }
}
