package Exercise;

public class Fibonacci {
    public static void fibonacciNumber(int num) {
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second+" ");
        for (int i = 1; i < num; i++) {
            int sum = first + second;
            System.out.print(sum +" ");
            first = second;
            second = sum;            
        }
        System.out.print("....");
    }
    public static void main(String[] args) {
        fibonacciNumber(8);
    }
}
