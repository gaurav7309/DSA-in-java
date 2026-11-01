class Solution {
    public static int nacci(int n,int[] dp){
        if(n<=1){
            return n;
        }
        else if(n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] =  nacci(n-1,dp)+nacci(n-2,dp)+nacci(n-3,dp);
    }
    public int tribonacci(int n) {
        int[] dp = new int [n+1];
        java .util.Arrays.fill(dp,-1);
        return nacci(n,dp);
    }
}