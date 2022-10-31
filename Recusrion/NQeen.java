package Recusrion;

import java.util.ArrayList;
import java.util.List;

public class NQeen {
    public static Boolean checkBoard(Boolean [][]board,int r,int c) {
        // // check left to rigth col
        // for (int i = 0; i < board[0].length; i++) {
        //     if(board[r][i] == true){
        //         return false;
        //     }
        // }
        // //check up to down
        // for (int i = 0; i < board.length; i++) {
        //     if(board[i][c] == true){
        //         return false;
        //     }
        // }
        // //check cross rigth
        // int row = r;
        // int col = c;
        // while (row != 0 && col != 0) {
        //     row--;
        //     col--;
        // }
        // // System.out.println(row+" "+col+"--->rigth");
     
        // while (row < board.length && row >= 0 && row < board.length && col >= 0 && col < board[0].length) {
        //     if(board[row][col] == true){
        //         return false;
        //     }
        //     col++;
        //     row++;
        // }
            
     

        // //check cross left
        // int rowl = r;
        // int coll = c;

        // while (coll != board[0].length-1 && rowl != 0 ) {
        //     rowl--;
        //     coll++;
        // }
        // // System.out.println(rowl+" "+coll+"--->left");
      
        // while (rowl < board.length && rowl >= 0 && rowl < board.length-1 && coll >= 0 && coll < board[0].length-1) {
        //     if(board[rowl][coll] == true){
        //         return false;
        //     }
        //     coll--;
        //     rowl++;
        // }
       

        // return true;
        int nr = r;
        int nc = c;
        while (nr >= 0) {
            if (board[nr][nc]) return false;
            nr--;
        }
        nr = r;
        while (nr >= 0 && nc >= 0) {
            if (board[nr][nc]) return false;
            nr--;
            nc--;
        }
        nr = r;
        nc = c;
        while (nr >= 0 && nc < board[0].length) {
            if (board[nr][nc]) return false;
            nr--;
            nc++;
        }
        return true;
    }

    public static void nQeen(Boolean [][]board,int r, int c ,List<List<String>> ans) {
        if (r == board.length) {
            ArrayList<String> currList = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                String currString = "";
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j]) currString += 'Q';
                    else currString += '.';
                }
                currList.add(currString);
            }
            ans.add(currList);
            return;
        }

       
            // System.out.println("row "+r+" col "+i);            
        if(checkBoard(board, r,c)){
            board[r][c] = true;
            nQeen(board, r+1,0,ans);            
            board[r][c] = false;
        }
        if(c + 1 < board.length){

            nQeen(board, r,c+1,ans);
        }
    }
    public static void main(String[] args) {
        int size = 4;
        Boolean [][] board = new Boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = false;
            }
        }
       List<List<String>> ans = new ArrayList<List<String>>();
        nQeen(board,0,0,ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
