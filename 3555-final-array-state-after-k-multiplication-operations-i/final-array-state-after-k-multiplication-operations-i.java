class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        for(int i = 1;i<=k;i++){
            //find the min and the replcae by the nums[i]*mulliplier
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int j = 0;j<n;j++){
        if(min>nums[j]){
            min = nums[j];
            index = j;
        }
        }    
        nums[index] = nums[index]*multiplier;

       }
       return nums;
    }
}