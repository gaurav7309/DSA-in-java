class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // kadane algorithum

      int n = nums.length;
      int sum = 0;
      int min = 0;
      int max  = 0;
      for(int i = 0;i<n;i++){
      sum+=nums[i];
      min = Math.min(min,sum);
      max = Math.max(max,sum);
      }  
      if(min==max){
        return max;
      }
      return (max-min);
    }
}