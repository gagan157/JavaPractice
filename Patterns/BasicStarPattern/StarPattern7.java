package Patterns.BasicStarPattern;

/*
 output
1
2 3
4 5 6
7 8 9 10
11 12 13 15

 */


public class StarPattern7 {
    public static void main(String[] args) {
        int row = 5;
        int count = 1; 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
