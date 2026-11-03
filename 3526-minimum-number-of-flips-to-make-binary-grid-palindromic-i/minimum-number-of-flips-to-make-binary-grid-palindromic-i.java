class Solution {
    public int minFlips(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int row_check = 0;
        int col_check = 0;
        
       for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            if(j<=m-1-j){
            if(grid[i][j]!=grid[i][m-1-j]){
            row_check++;
            }
            }
        }
       }

       // for the col 
        for(int i = 0;i<m;i++){
        
        for(int j = 0;j<n;j++){
            if(j<=n-1-j){
            if(grid[j][i]!=grid[n-1-j][i]){
            col_check++;
            }
            }
        }
       }
       return Math.min(row_check,col_check);
    }
}