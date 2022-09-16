package Patterns.AdvanceStarPatterns;


/*

output
        *
       * *
      * * *
     * * * *
      * * *
       * *
        *


 */


public class StarPattern8 {
    public static void main(String[] args) {
        int row = 5;
        //row outer
        for (int i = 1; i < 2*row; i++) {
            if(i <= row){

                //spaces
                for (int j = 0; j < row-i; j++) {
                    System.out.print(" ");
                }
                //print star
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else{
                // space
                for (int j = 0; j < i-row; j++) {
                    System.out.print(" ");
                }
                //print star
                for (int j = 2*row-i; j >=1 ; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
