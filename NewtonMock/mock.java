package NewtonMock;


/*
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.less than O(n^2)

Input: arr[] = {-1, -3, -10, 0, 60}
2,3,-2,-1 

Output: 60 */


/* 
Given a sorted and rotated array, find the minimum element index in the array, with O(logN) time complexity

input: [7, 8, 9, 2, 3]

output: 3 */

public class mock {
    public static int findMinEle(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        int founindx = -1;
        while (start <= end ) {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                return mid+1;
            }
            else if(arr[mid] < arr[mid-1]){
                return mid;
            }
            else if(arr[start] < arr[mid]){
                start = mid+1;
            }
            else if(arr[mid] < arr[end]){
                end = mid-1;
            }
        }
        return founindx;
    }

    public static void maxProduct(int arr[]) {
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

            maxp = Math.max(maxp, max);
        }
        System.out.print(maxp);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,-2,-1};
        maxProduct(arr);
        // int arr[] = {7, 8, 9, 10, 3};
        // int ans = findMinEle(arr);
        // System.out.println(ans);
    }
}
