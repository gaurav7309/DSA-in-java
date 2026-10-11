class Solution {
    public int minDifference(int[] nums) {
    //  int n = nums.length;
    //  if( n<=4){
    //     return 0;
    //  }
    //  int min = Integer.MAX_VALUE;
    //  for(int i = 0;i<n;i++){
    //     min = Math.min(min,nums[i]);
    //  }   
    //  // after top 3 ele move three element to the lowest ele
    //  int max = Integer.MIN_VALUE;
    //  int index = 0;
    //  for(int i = 0;i<n;i++){
    //  if(max<nums[i]){
    //     max = nums[i];
    //     index = i;
    //  }
    //  }
  
    //  nums[index] = min;
    //  max = Integer.MIN_VALUE;
     
    //   for(int i = 0;i<n;i++){
    //  if(max<nums[i]){
    //     max = nums[i];
    //     index = i;
    //  }
    //  }
    //  nums[index] = min;
    //  max = Integer.MIN_VALUE;
    //  index = 0;

    //   for(int i = 0;i<n;i++){
    //  if(max<nums[i]){
    //     max = nums[i];
    //     index = i;
    //  }
    //  }
    //  nums[index] = min;    
    //  // find out the min and the max element 
    //  max  = Integer.MIN_VALUE;
    //  min = Integer.MAX_VALUE;
    //  for(int i = 0;i<n;i++){
    //     min = Math.min(min,nums[i]);
    //     max = Math.max(max,nums[i]);
    //  }
    //  return max-min;

    // 0 1 1 4 6 6 6
    Arrays.sort(nums);
    int n = nums.length;
    if(n<=4){
        return 0;
    }
    int min  = Integer.MAX_VALUE;
    min  = Math.min(nums[n-4]-nums[0],min);
    min = Math.min(nums[n-3]-nums[1],min);
    min = Math.min(nums[n-2]-nums[2],min);
    min = Math.min(nums[n-1]-nums[3],min);
    return min;
    }
}