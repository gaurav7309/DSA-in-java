class Solution {
    static int[] dp;
   public static int solved(int n){
     if(n<=1){
        return 1;
     }
     if(dp[n]!=-1){
        return dp[n];
     }
     int ans = 0;
     for(int i = 1;i<=n;i++){
     ans += solved(i-1)*solved(n-i);
     }
     return dp[n] = ans;
    }
    public int numTrees(int n) {
     
      dp = new int[n+1];
      java.util.Arrays.fill(dp,-1);
        return solved(n); 
    }
}