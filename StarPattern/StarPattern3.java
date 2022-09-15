package StarPattern;


/*
output
 * * * * *
 * * * *
 * * * 
 * *
 * 
 
 */

public class StarPattern3 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;

        for (int i = 0; i < row; i++) {
            for (int j = col-i; j > 0 ; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
