package Arrays;

import java.util.*;


public class Histogram {
    public static void histogram(int arr[]) {
        ArrayList<Integer> larr = new ArrayList<>();
        ArrayList<Integer> rarr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        larr.add(-1);
        for (int i = 1; i < arr.length; i++) {
            while (!stack.empty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if(stack.empty()){
                larr.add(-1);
            }
            else{
                larr.add(stack.peek());
            }
            stack.push(i);
        }
        stack.clear();

        stack.push(arr.length-1);
        rarr.add(0,arr.length-1);
        for (int i = 7-2; i >= 0 ; i--) {
            while (stack.size() > 0 && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }
            if(stack.empty()){
                rarr.add(0,arr.length-1);
            }
            else{
                rarr.add(0,stack.peek());
            }
            stack.push(i);
        }
       
        // area
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sub = larr.get(i) - rarr.get(i);
            if(sub < 0){
                sub *= -1;
            }
            int mul = arr[i] * sub;
            if(mul > max){
                max = mul;
            }
        }
        
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {6,2,5,4,5,1,6};
        histogram(arr);

    }
}
