class Solution {
    public long maxAlternatingSum(int[] nums) {
        int  n = nums.length;
        int [] ans = new int[n];
        for(int i = 0;i<n;i++){
            ans[i] = nums[i]*nums[i];
        } 
        Arrays.sort(ans);
        long sum = 0;
        for(int i = 0;i<(n+1)/2;i++){
        sum+=ans[n-1-i];
        }
           for(int i = 0;i<n/2;i++){
        sum-=ans[i];
        }
        return sum;
    }
}