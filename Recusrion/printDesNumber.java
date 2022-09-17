package Recusrion;

// import java.util.*;

public class printDesNumber {
    public static void printDescendingNumber(int num) {
        if(num == 0){
            return;
        }

        System.out.print(num+" ");
       
        printDescendingNumber(num-1);
    }
    public static void main(String[] args) {
        printDescendingNumber(5);
    }
    
}