package Arrays;



public class MaxProductSubArray {
    public static void maxProductSubArray(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        int maxp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            maxp = Math.max(max,maxp);
        }
        System.out.print(maxp);
    }
    public static void main(String[] args) {
        int arr[] = {-1, -1, -2, 4, 3};
        maxProductSubArray(arr);
    }
}
