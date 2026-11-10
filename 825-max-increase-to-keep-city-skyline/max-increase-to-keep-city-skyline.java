class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n   = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int max_col = Integer.MIN_VALUE;
                int max_row = Integer.MIN_VALUE;
                // find the max in the col

                for(int k = 0;k<m;k++){
                    max_col = Math.max(max_col,grid[i][k]);
                }

                //find the max in the row
                for(int k = 0;k<n;k++){
                    max_row = Math.max(max_row,grid[k][j]);
                }
               // diff between the original and the max ele
               ans+=Math.abs(grid[i][j]-Math.min(max_row,max_col));
               grid[i][j] =  Math.min(max_row,max_col);
            }
        }
        return ans;
    }
}