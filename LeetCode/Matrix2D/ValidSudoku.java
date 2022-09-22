package LeetCode.Matrix2D;

import java.util.*;

class ValidSudokuSolution {
    public boolean isValidSudoku(String[][] board) {
        HashSet<String> hs = new HashSet<String>();
        
        int rowsize = board.length;
        int colsize = board[0].length;
        
        
        int startrow = 0;
        int startcol = 0;
        
        int endrow = rowsize-1;
        int endcol = colsize-1;
        
        
        while(startrow <= endrow && startcol <= endcol){
            
            //col
            int countcol = 0;
            for(int i = 0; i <= endcol; i++){
                
                if(!hs.contains(board[startrow][i])  &&  board[startrow][i] != "."){
                    hs.add(board[startrow][i]);
                    countcol++;
                }
                else if(hs.contains(board[startrow][i])){
                    return false;
                }
               
            }
            if(countcol == 0){
                return false;
            }
          
            hs.clear();
            //row
            int countrow =0;
            for(int i = 0; i<= endrow; i++){
                if(!hs.contains(board[i][startcol]) && board[i][startcol] != "." ){
                    hs.add(board[i][startcol]);
                    countrow++;
                }
                else if(hs.contains(board[i][startcol])){
                    return false;
                }
             
            }
            if(countrow == 0){
                return false;
            }
           
            hs.clear();
            startrow++;
            startcol++;
            
        }
        return true;
    }
}

public class ValidSudoku {
    public static void main(String[] args) {
        String board[][] = {{"5","3",".",".","7",".",".",".","."}
        ,{"6",".",".","1","9","5",".",".","."}
        ,{".","9","8",".",".",".",".","6","."}
        ,{"8",".",".",".","6",".",".",".","3"}
        ,{"4",".",".","8",".","3",".",".","1"}
        ,{"7",".",".",".","2",".",".",".","6"}
        ,{".","6",".",".",".",".","2","8","."}
        ,{".",".",".","4","1","9",".",".","5"}
        ,{".",".",".",".","8",".",".","7","9"}};
        ValidSudokuSolution vd = new ValidSudokuSolution();
        boolean ans= vd.isValidSudoku(board);
        System.out.println(ans?"True":"False");
    }
}
