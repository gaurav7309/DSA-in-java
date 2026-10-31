class Solution {
    static int unique(int [][] obstacleGrid,int [][] dp,int i ,int j){
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        if(i>=r || j>=c){ // if the i and the j are the exceeded to the limit of the grid
            return 0;
        }

        
        
        if(obstacleGrid[i][j]==1){    // if the obstecals comes then stop
            return 0;
        }
        
        if(i==r-1 && j==c-1){  // when reaching the destination
            return 1;
        }

        if(dp[i][j]!=-1){       // handel the recursive call
            return dp[i][j];
        }
        int left  = unique(obstacleGrid,dp,i+1,j);  //  howmany way for finding the destination with the help of the left moves


        int right = unique(obstacleGrid,dp,i,j+1);   // howmant way for finding the destination with the help of the right moves 

        return dp[i][j] = left+right;   
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    
       int n = obstacleGrid.length;
       int m  = obstacleGrid[0].length;
          int [][] dp = new int[n][m];
       for(int i = 0;i<n;i++){
        java.util.Arrays.fill(dp[i],-1);
       } 
       
      return  unique(obstacleGrid,dp,0,0);

    }
}