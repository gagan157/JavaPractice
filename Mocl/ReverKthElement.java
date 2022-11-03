package Mocl;

import java.util.*;


/*
 Given an integer k and a queue of integers, The task is to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order.

Input : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100], k = 5

Output : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
 */
public class ReverKthElement {
    public static void reversekthele(Queue<Integer> q,int k) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> nq = new LinkedList<>();
        int i=0;
        while (!q.isEmpty() && i < k) {
            int r = q.remove();
            st.push(r);
            i++;
        }
        while (!st.empty()) {
            int p =st.pop();
            nq.offer(p);
        }      
        while (!q.isEmpty()) {
            int r = q.remove();
            nq.offer(r);
        }
        System.out.println(nq);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Queue<Integer> q = new LinkedList<>();        
        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
        }    
        int k = 5;   
        reversekthele(q,k);

    }
}
