package Recusrion;

//output
// n = 1 - 111
//n = 2 211121112
//n=3 3211121112321112111...

public class PrintTriplets {
    public static void printTriplets(int n) {
        if(n == 0){
            return;
        }
        System.out.println("pre "+n);
        printTriplets(n-1);
        System.out.println("in "+n);
        printTriplets(n-1);
        System.out.println("post "+n);
    }
    public static void main(String[] args) {
        printTriplets(2);
    }
}
