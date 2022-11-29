package NewtonMock;

import java.util.ArrayList;

public class Mock10 {
    public static int pows(int num,int pw) {
        if(pw == 0){
            return 1;
        }
        int re = pows(num,pw/2);

        re = re * re;
        if(pw % 2 == 1){
            re = re * num;
        }
        return re;
    }
    public static void binaryToNum(int bin){
        int Num = 0;
        int count = 0;
        while (bin != 0) {
            int rem = bin % 10;
            if(rem != 0){   
                Num += pows(2, count);             
            }
            bin = bin/10;
            count++;
        }
       System.out.println(Num);
    }

    public static void numToBinary(int num) {
        ArrayList<Integer> arr = new ArrayList<>();       
        while (num != 0) {
            int rem = num % 2;
            arr.add(rem);
            num = num/2;
        }
        for (int i =arr.size()-1; i>=0; i--) {
            System.out.print(arr.get(i));
        }
    }
    public static int gcd(int a,int b) {
        if(a == 0){
            return b;
        }
        else if(b == 0){
            return a;
        }
        if(a == b){
            return a;
        }
        if(a > b){
            return gcd(a-b, b);
        }
        else{
            return gcd(a, b-a);
        }
    }
    public static void printNum(int num) {
        if(num == 0){
            return;
        }
        printNum(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        // printNum(100);
        // System.out.println();
        // System.out.println("GCD = "+gcd(54, 24));
        // System.out.println();
        // binaryToNum(10111);
        // System.out.println();
        // numToBinary(32);
    }
}
