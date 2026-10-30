class Solution {
   static int  climb(int [] cost,int[] dp,int n,int ans){
 
    if(n<0){
     return 0;
    }
    if(n==0||n==1){
        return cost[n];
    }
    if(dp[n]!=-1){
    return dp[n];
    }
   
    return dp[n] = cost[n]+Math.min(climb(cost,dp,n-1,ans),climb(cost,dp, n-2,ans));
    
   }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] dp = new int[n];
        java.util.Arrays.fill(dp,-1);
        return Math.min(climb(cost,dp,n-1,0),climb(cost,dp,n-2,0));

       }
}