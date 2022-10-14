package Arrays;

public class SumOfOddLenSubarr {
    public static boolean isOdd(int num) {
        if(num % 2 != 0){
            return true;
        }
        return false;
    }

    public static void sumOfSubarr(int arr[]) {
        long subsum = 0;
        //formula tim complexity = O(n)
        // result += (arr[i] * (i+1) * (n-i)); 
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int count = 0;
                long subarr = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    count++;
                    subarr += arr[j2];
                    // System.out.print(arr[j2]+" ");
                }
                if(isOdd(count)){
                    subsum += subarr;
                    // System.out.print("count = "+count+ "---> " + subarr);
                }
                // System.out.print();
            }
        }

        System.out.println(subsum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        sumOfSubarr(arr);
    }
}
