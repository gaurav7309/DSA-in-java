class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
       int n = nums.length;
       int c = 0;
       for(int i = 0;i<n;i++){
       int len = 0; 
       int tar = 0;
        for(int j = i;j<n;j++){
        len++;
        if(nums[j]==target){
          tar++;
        }
        if(tar>len/2){
            c++;
        }
        }
        }
       
       return c;
    }
}