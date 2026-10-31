class Solution {
   static int[][] dp;
   static int unique(int i ,int j,int m,int n){ // call by the reference
  
    
   
   if(i>=m || j>=n){ // if any one of the index is exceed the 
    return 0;
   }
      
     if(dp[i][j]!=-1){
        return dp[i][j];
    } 

    if(i==m-1 && j==n-1){ // if the robot finding the
        return 1;
    }
  
  
   
    int left = unique(i+1,j,m,n);
    int right = unique(i,j+1,m,n);
    return dp[i][j] = left+right;
   }
    public int uniquePaths(int m, int n) {
     dp = new int[101][101];
      for(int i = 0;i<101;i++){
      java.util.Arrays.fill(dp[i],-1);
      }  
      return unique(0,0,m,n);  // calling the function(call by value)

    }
}