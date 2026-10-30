class Solution {
    static int robbrt(int[] nums,int[] dp,int n){
    if(n==0){
        return nums[n];
    }
    else if(n<0){
        return 0;
    }
    if(dp[n]!=-1){
        return dp[n];
    }
    return dp[n] = Math.max(robbrt(nums,dp,n-2)+nums[n],robbrt(nums,dp,n-1));
    }
    public int rob(int[] nums) {
      int n  = nums.length;
      int[] dp = new int [n];
      Arrays.fill(dp,-1);
     return Math.max(robbrt(nums,dp,n-1),robbrt(nums,dp,n-2));

    }
}