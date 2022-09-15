package Patterns.AdvanceStarPatterns;

/*
 output

        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *

 */


public class StarPattern4 {
    public static void main(String[] args) {

        int row = 5;

        for (int i = 1; i <= row; i++) {

            for (int j = row-i; j >= 1; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j < row; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
