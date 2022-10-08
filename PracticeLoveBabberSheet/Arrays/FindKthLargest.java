package PracticeLoveBabberSheet.Arrays;

import java.util.*;

class Pair{
    int kmin;
    int kMax;
}

public class FindKthLargest {
    public static void findKthLargestORSmallest(int arr[],int k) {
        Pair kminmax = new Pair();
        Queue<Integer> maxpq = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> minpq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            maxpq.offer(arr[i]);
            minpq.offer(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if(arr[i] < maxpq.peek()){
                maxpq.poll();
                maxpq.offer(arr[i]);
            }
            else if(arr[i] > minpq.peek()){
                minpq.poll();
                minpq.offer(arr[i]);
            }
        }
        kminmax.kmin = maxpq.peek();
        kminmax.kMax = minpq.peek();
        System.out.println("Kth Smallest value "+ kminmax.kmin );
        System.out.println("Kth Largest value "+ kminmax.kMax );
    }
    public static void main(String[] args) {
        int arr[]= {7, 10, 4, 3, 20, 15};
        //3 4 7 
        int k = 3;
        findKthLargestORSmallest(arr, k);
    }
}
