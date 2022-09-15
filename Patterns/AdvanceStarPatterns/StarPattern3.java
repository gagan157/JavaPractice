package Patterns.AdvanceStarPatterns;

/*
ouput

*             *
* *         * *
* * *     * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *

 */


public class StarPattern3 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i < 2*row; i++) {
            if(i <= (2*row)/2){

                //left pattern star 
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                //mid space
                for (int j = 1; j <= (2*row)-(i+i); j++) {
                    System.out.print("   ");
                }
                //right pattern star
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                
            }
            else{
                int cal = (2*row)-i;
                for (int k = cal; k >= 1; k--) {
                    System.out.print(" * ");
                }
                // mid space
                for (int j = 1; j <= (2*row)-(cal+cal); j++) {
                    System.out.print("   ");
                }
                // right pattern star
                for (int j = cal; j >= 1; j--) {
                    System.out.print(" * ");
                }
            }

            System.out.println();
        }
    }
}
