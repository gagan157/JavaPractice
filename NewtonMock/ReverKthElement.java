package NewtonMock;

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
    public static void sortOnlyOdd(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                int j=i+1;
                int k=i;
                while (j < arr.length) {
                    if(arr[j] < arr[k] && arr[j] % 2 != 0){
                        int temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                    }
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        // int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // Queue<Integer> q = new LinkedList<>();        
        // for (int i = 0; i < arr.length; i++) {
        //     q.offer(arr[i]);
        // }    
        // int k = 5;   
        // reversekthele(q,k);
        int arr[] = {2,4,1,5,6,-1,7,8}; 
        sortOnlyOdd(arr);
        for (int i = 0; i < arr.length; i++) {            
            System.out.print(arr[i]+" ");
        }
    }
}
