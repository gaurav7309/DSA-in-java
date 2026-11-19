class Solution {
    public int minimizeSum(int[] nums) {
       int n = nums.length;
    //    nums[0] = nums[1];
    //    nums[n-1] = nums[n-2];
       Arrays.sort(nums);
      int min = nums[1]-nums[0];
      int max1 = nums[n-2]-nums[1];
      int max2 = nums[n-1] - nums[2];
      int max3 = nums[n-3]-nums[0];
      int max = Math.min(max1,Math.min(max2,max3));
      return max;
       }
}