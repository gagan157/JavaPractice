package Patterns.AdvanceStarPatterns;


/*
output

     *
    ***
   *****
  *******
   *****
    ***
     *


 */

public class StarPattern9 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            // space
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row; i >= 1; i--) {
            // space
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
