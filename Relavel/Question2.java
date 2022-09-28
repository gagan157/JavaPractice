package Relavel;

import java.util.*;

// import javax.swing.plaf.synth.SynthStyle;

/*
 DIVISIBILITY BY K
Problem Statement



Amy has an array A of N integers.



In one operation she can select a non-empty subsequence of array A and increase or decrease each element of the array by 1.



Find the minimum number of operations she needs to make each element of the array A, divisible by K.



You are given T independent test cases.





Constraints



1 <= T <= 10
1 <= N <= 105
2 <= K <= 105
0 <= Ai <= 109
All input values are integers.




Input Format



First-line contains T.
First line of each test case consists of two space separated integers N and K.
Second line of each test case has N space separated integers denoting the array A.




Output Format



Print in a newline for each test case a single integer denoting the minimum number of operations she needs to 
make each element of the array divisible by K.




Sample Input 1



1

4 3

4 3 6 2





Sample Output 1



2








 */




// 1
// 4 3

// 4 3 6 2

//2 3 4 6

// decri
//1 2index
//3 2 6 2

//incri
//2 4index
//3 3 6 3



public class Question2 {
    
    public static void divibleByK(int[] arr,int n,int k) {
        int i=0;
        while (i < n-1) {

            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for (int j = 0; j < arr.length; j++) {
                arr[i] = sc.nextInt();
            }

            divibleByK(arr, n, k);
        }
        sc.close();
    }
}
