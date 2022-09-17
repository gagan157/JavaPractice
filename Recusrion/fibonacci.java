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
    public static void main(String[] args) {
        System.out.print(0+" ");
        fibonacciseriace(0, 1, 0, 5);
    }
}
