package Recusrion;

public class printAecNumber {
    public static void printAccedingNumber(int num) {
        if(num ==  0){
            return;
        }

        printAccedingNumber(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        int num = 5;
        printAccedingNumber(num);
    }
}
