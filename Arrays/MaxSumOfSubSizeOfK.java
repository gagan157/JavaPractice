package Arrays;

//Max sum of sub Array Size of K
public class MaxSumOfSubSizeOfK {
    public static void maxSumOfSubSizeOfK(int arr[],int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += arr[i];
        }

        int currentElement = max;

        for (int i = k; i < arr.length; i++) {
            currentElement += arr[i] - arr[i-k];
            max = Math.max(currentElement, max); 
        }

        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]= {100, 200, 300, 400};
        int k=2;
        maxSumOfSubSizeOfK(arr, k);
    }
}
