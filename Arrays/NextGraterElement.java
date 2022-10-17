package Arrays;

import java.util.*;


public class NextGraterElement {
    
    public static void nextGraterElement(int arr[]) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        int j = arr.length-1;
        stk.push(arr[arr.length-1]);
        list.add(0, -1);
        for (int i = j-1; i >= 0; i--) {
            while (stk.size() > 0 && arr[i] >= stk.peek() ) {
                stk.pop();
            }

            if(stk.size() == 0){
                list.add(0, -1);
            }
            else{
                list.add(0, stk.peek());
            }
            stk.push(arr[i]);
        }
        System.out.println(list);
       
    }
    public static void main(String[] args) {
        int arr[] = {2,5,9,3,1,12,6,8,7};
        nextGraterElement(arr);
    }
}
