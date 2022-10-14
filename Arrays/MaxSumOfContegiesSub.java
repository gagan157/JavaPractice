package Arrays;

public class MaxSumOfContegiesSub {
    public static void maxCongiesSub(int arr[]) {
        int max = Integer.MIN_VALUE;

        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 8, -2, 6, -8, 5};
        maxCongiesSub(arr);
    }
}
