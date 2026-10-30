class Solution {
    static int edit_dis(String word1,String word2,int n,int m,int[][] dp){
        if(n==0){
            return m;
        }
        else if(m==0){
            return n;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(word1.charAt(n-1)==word2.charAt(m-1)){
            return dp[n][m] = edit_dis(word1,word2,n-1,m-1,dp);
        }
        else{
            int insert = edit_dis(word1,word2,n,m-1,dp);
            int delete = edit_dis(word1,word2,n-1,m,dp);
            int replace = edit_dis(word1,word2,n-1,m-1,dp);
            return dp[n][m]=1+Math.min(insert,Math.min(delete,replace));
        }
    }
    public int minDistance(String word1, String word2) {
     int n = word1.length();
     int m = word2.length();
     int [][] dp = new int[n+1][m+1];
     for(int i = 0;i<=n;i++){
        java.util.Arrays.fill(dp[i],-1);
     }
  
     return edit_dis(word1,word2,n,m,dp);
    }
}