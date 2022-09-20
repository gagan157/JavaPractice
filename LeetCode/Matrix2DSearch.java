package LeetCode;


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        // System.out.println(col);
        int start = 0;
        int end =(row*col)-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            // System.out.println(mid);
            int rowindex = mid/col;
            int colindex = mid%col;
            // System.out.println("rowind "+rowindex+" colind "+colindex);
            
            
            
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
