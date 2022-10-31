package Recusrion;

import java.util.ArrayList;

public class RatInMaze {
    public static void ratinMaze(int[][] maze,int row,int col,int size,String path,ArrayList<String> ans) {
        if(row == size && col == size){
            // ans.add(path);
            System.out.println(path);
            return;
        }
        maze[row][col] = 0;
        if(row-1 >= 0  && maze[row-1][col] != 0){
            // ans.add("Up");
            ratinMaze(maze, row-1, col,size,path+"U",ans);
        }
        if(col < size && maze[row][col+1] != 0){
            // ans.add("Rigth");
            ratinMaze(maze, row, col+1,size,path+"R",ans);
        }
        if(row < size && maze[row+1][col] != 0){
            // ans.add("Down");
            ratinMaze(maze, row+1, col,size,path+"D",ans);
        }
        if(col-1 >= 0 && maze[row][col-1] != 0){
            // ans.add("Left");
            ratinMaze(maze, row, col-1,size,path+"L",ans);
        }
        maze[row][col] = 1;
    }
    public static void main(String[] args) {
        int [][] maze = {{1, 0, 0, 0},
                         {1, 1, 0, 1},
                         {1, 1, 0, 1},
                         {0, 1, 1, 1}};
        ratinMaze(maze,0,0,4-1,"",new ArrayList<String>());                 
    }
}
