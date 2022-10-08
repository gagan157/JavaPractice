package Recusrion;

import java.util.*;


public class MazePath {
    public static ArrayList<String> uniqePath(int startrow,int startcol,int col ,int row) {
        if(startrow == row && startcol == col){
            ArrayList<String> re = new ArrayList<>();
            re.add("");
            return re;
        }
        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();

        if(startcol < col){
            hpath = uniqePath(startrow, startcol+1, col, row);
        }
        if(startrow < row){
            vpath = uniqePath(startrow+1,startcol,col,row);
        }
        ArrayList<String> path = new ArrayList<>();

        for (String hp : hpath) {
            path.add("h" + hp);
        }
        for (String vp : vpath) {
            path.add("v" + vp);
        }
        return path;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        ArrayList<String>ans = uniqePath(1,1,col, row);
        System.out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
