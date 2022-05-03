/*
Problem Statement: 
73. Set Matrix Zeroes
    Medium
    Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
    You must do it in place.
    "https://leetcode.com/problems/set-matrix-zeroes/"
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i, j, k = 1;
        for(i=0; i<m; i++){
            if(matrix[i][0] == 0) k = 0;
            for(j=1; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                    
                }
            }
        }
 
        for(i=m-1; i>=0; i--){
            for(j=n-1; j>0; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if(k == 0)
                    matrix[i][0] = 0;
        }
    }
}    
