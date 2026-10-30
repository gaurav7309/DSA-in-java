class Solution {
    static int common(String text1,String text2,int n,int m,int[][] dp){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(text1.charAt(n-1)==text2.charAt(m-1)){
            return dp[n][m] =  1+common(text1,text2,n-1,m-1,dp);
        }

        else{
            int text1_one_Not_match = common(text1,text2,n-1,m,dp);
            int text2_two_Not_match = common(text1,text2,n,m-1,dp);
            return dp[n][m] = Math.max(text1_one_Not_match,text2_two_Not_match);

        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [][] dp = new int[n+1][m+1];
        for(int i = 0;i<=n;i++){
            java.util.Arrays.fill(dp[i],-1);
        }
       return  common(text1,text2,n,m,dp);
    }
}