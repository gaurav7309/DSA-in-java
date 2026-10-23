class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int n = nums.length;
       int windowsum = 0;
       int start = 0;
       int min = Integer.MAX_VALUE;
       for(int end = 0;end<n;end++){
    windowsum+=nums[end];
    while(windowsum>=target){
    windowsum-=nums[start];
    min = Math.min(min,end-start+1);
    start+=1;
    }
       } 
       return min ==Integer.MAX_VALUE?0:min;
    }
}