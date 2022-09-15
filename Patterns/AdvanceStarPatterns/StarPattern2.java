package Patterns.AdvanceStarPatterns;

/*
 
ouput

*        
* *        
* * *     
* * * * 
* * *     
* *         
*         

 */


public class StarPattern2 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i < 2*row; i++) {
            if(i <= (2*row)/2){
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }

            }
            else{
                for (int j = (2*row)-i; j >= 1 ; j--) {
                    System.out.print(" * ");
                }
               
            }
            System.out.println();
        }
        
    }
}
