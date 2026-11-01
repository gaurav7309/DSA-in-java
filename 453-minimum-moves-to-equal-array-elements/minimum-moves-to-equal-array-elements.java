class Solution {
    public int minMoves(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int ans = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
         ans+=nums[i]-min;
        }
        return ans;
    }
}