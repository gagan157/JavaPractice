package Patterns.Binary;

import java.util.*;

public class DesimalToBinary {

    public static int DecimalConvToBinary(int num){
        StringBuilder ans = new StringBuilder();

        while(num != 0){
            int rem = num % 2;
            ans.insert(0, rem);
            num /= 2;
        }
     
        String finalans = ans.toString();
        int number = Integer.parseInt(finalans);
        return number;
    }

    public static void main(String[] args) {
        int num = 10;
        int ans = DecimalConvToBinary(num);
        System.out.print(ans);
    }
}
