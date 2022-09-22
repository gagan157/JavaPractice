package LeetCode.Matrix2D;


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
       
        int start = 0;
        int end =(row*col)-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            //cal row index
            int rowindex = mid/col;
            //cal col index
            int colindex = mid%col;
           
            
            
            
            if(matrix[rowindex][colindex] == target){
                return true;
            }
            
            if(matrix[rowindex][colindex] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}

public class Matrix2DSearch {
    public static void main(String[] args) {
        int[][] matrix = {  {1,2},
                            {3,5}
                            };
        int target = 2;
        Solution sol = new Solution();
        boolean ans = sol.searchMatrix(matrix, target);
        System.out.print(ans? "True" : "False");
    }
}
