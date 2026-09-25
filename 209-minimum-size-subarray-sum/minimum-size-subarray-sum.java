class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int n = nums.length;
      int min = Integer.MAX_VALUE;
        int sum = 0;
        int p = 0;
      for(int i = 0;i<n;i++){
      sum+=nums[i];
      while(sum>=target){
        sum-=nums[p];
        min = Math.min(min,i-p+1);
        p++;
      }
        
      }

      if(min==Integer.MAX_VALUE){
        return 0;
      } 
      return min; 
    }
}