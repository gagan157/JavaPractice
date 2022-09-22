package LeetCode.Matrix2D;

class SolutionII {
    public boolean searchMatrixII(int[][] matrix, int target) {
        int rowsize = matrix.length;
        int colsize = matrix[0].length;
        
        int startrow = 0;
        int startcol =0;
        int endrow = rowsize-1;
        int endcol = colsize-1;
        
        
        
        while(startrow <= endrow && startcol <= endcol){
            int currentindex = matrix[startrow][endcol];
            
           if(currentindex == target){
               return true;
           }
            
           if(currentindex > target){
               endcol--;
            } 
            else if(currentindex < target){
                startrow++;
            }
        }
        return false;
       
    }
}


public class Matrix2DSearchII {
    public static void main(String[] args) {
        int[][] matrix = {  {5}
                        };
        int target = 5;
        SolutionII sol = new SolutionII();
        boolean ans= sol.searchMatrixII(matrix, target);
        System.out.println(ans?"True":"False");
    }
}
