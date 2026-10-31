class Solution {
    static int[][]dp;
    static int minpath(int [][] grid,int i,int j){
        int n = grid.length;
        int m = grid[0].length;

        if(i>=n || j>=m){
            return Integer.MAX_VALUE;
        }
        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int result = Math.min(minpath(grid,i+1,j),minpath(grid,i,j+1));
        return dp[i][j] = result + grid[i][j] ;
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        dp = new int[n+1][m+1];
        for(int i  = 0;i<n;i++){
            java.util.Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
       return  minpath(grid,0,0);
    }
}