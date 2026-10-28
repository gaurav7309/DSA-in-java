class Solution {
    public int climbStairs(int n) {
        var dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solved(n,dp);
    }
    public static int solved(int n,int[] dp){
        if(n<=1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = solved(n-1,dp)+solved(n-2,dp);
        return dp[n];
    }
}