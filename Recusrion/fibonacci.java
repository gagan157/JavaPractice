package Recusrion;

public class fibonacci {
    public static void fibonacciseriace(int first,int second,int sum,int index) {
        if(index==0){
            return;
        }
        sum = first + second;
        System.out.print(sum+" ");
        //swap
        // second = first;
        // first = sum;
        fibonacciseriace(sum, first,sum, index-1);
        
    }

    public static int fibonacci2(int num) {
        if(num == 1 || num == 0){
            return num;
        }
        
        return fibonacci2(num-1) + fibonacci2(num-2);
    }
    public static void main(String[] args) {
        // System.out.print(0+" ");
        // fibonacciseriace(0, 1, 0, 5);
        System.out.println(fibonacci2(5));
    }
}
