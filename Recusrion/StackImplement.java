package Recusrion;

import java.util.*;

public class StackImplement {
    static Stack<Integer> stack = new Stack<>();
   
    public static void pushInBtm(int data) {
        if(stack.empty()){
            stack.push(data);
            return;
        }

        int peekval = stack.peek();
        stack.pop();
        pushInBtm(data);
        stack.push(peekval);
    }
    
    public static void peekAtBtm() {
        if(stack.empty()){
            return;
        }
        int val = stack.peek();
        stack.pop();
        // int retval = val;
        if(stack.size() == 0){
            System.out.println("peek value = "+val);
            
        }
        peekAtBtm();
        stack.push(val);
       
    }
    
    public static void popAtBtm() {
        if(stack.empty()){
            return;
        }
        // int val = stack.peek();
        stack.pop();
        popAtBtm();

    }

    public static void printStack() {
        if(stack.empty()){
            return;
        }
        int peekval = stack.peek();
        stack.pop();
        printStack();
        System.out.print(peekval+" ");
        stack.push(peekval);
    }

    
    public static void main(String[] args) {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        printStack();

        pushInBtm(40);

        System.out.println();
        printStack();

        System.out.println();
        peekAtBtm();

        pushInBtm(50);
        printStack();
        System.out.println();
        peekAtBtm();
        
        
    }
}
