package Relavel;
import java.util.*;


/* More the merrier

Problem Statement

 

Alex has an integer array A, of size N.

 

Each element in the array represents the color of balloons Alex has. (Same integer representing same color balloon, while different integer representing a different color balloon).

 

Now, Alex needs to select M consecutive balloons, such that he gets the maximum number of distinct color balloons.

 

 

Input Format

First line contains two integers representing N, and M respectively.
Second line contains integers representing array A.
 

Output Format

Output the maximum number of distinct balloons Alex can select.
 

 

Constraints

1<=M<=N<=3*10^5
1<=A[i]<=10^9
 

 

Sample Input 1

5 3

3 1 1 2 3

 

Sample Output 1

3

 

 

﻿Explanation of Sample 1

Alex can select balloons from index 3rd till index 5th (Assuming one-based indexing).

Hence he gets 3 distinct colors, which is maximum. */



public class Question1 {
    public static void sol(int[] arr,int n,int m) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = m-1; i <= arr.length-1; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                int val = map.get(arr[i]);
                val++;
                map.put(arr[i], val);
            }
        }

        System.out.println(map.size());
        
    }
    public static void main(String[] args) {
        // 5 3
        // 3 1 1 2 3
        int [] arr = {3,1,1,2,3};
        int n = 5 , m = 3;
        sol(arr,n,m);

    }
}
