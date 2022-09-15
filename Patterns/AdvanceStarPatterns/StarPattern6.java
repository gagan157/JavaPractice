package Patterns.AdvanceStarPatterns;


/* 
output

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 
  
 */



public class StarPattern6 {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = row-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"   ");
            }
            System.out.println();
        }
    }
}
