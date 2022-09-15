package Patterns.AdvanceStarPatterns;

/*

 output

* * * * * * * *
* * *     * * *
* *         * *
*             *
* *         * *
* * *     * * *
* * * * * * * *

 */


public class StarPattern1 {
    public static void main(String[] args) {
        int row = 5;
        int size = 2*row;
        for (int i = size; i >= 1 ; i--) {
            if(i > size/2){

                // left
                int dif = i-row;
                for (int j = dif; j >= 1; j--) {
                    System.out.print(" * ");
                }
                // mid space
                for (int j = 1; j <= size - (dif+dif); j++) {
                    System.out.print("   ");
                }
                //right
                for (int j = i-row; j >= 1; j--) {
                    System.out.print(" * ");
                }
            }
            else{
                int dif = row-i+1;
                for (int j = 0; j < row-i+1; j++) {
                    System.out.print(" * ");
                }

                for (int j = 0; j < size - (dif+dif); j++) {
                    System.out.print("   ");
                }

                for (int j = 0; j < row-i+1; j++) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }
}
