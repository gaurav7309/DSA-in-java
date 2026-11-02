class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i = 0;i<n-1;i++){
           
            max = Math.max(max,i+nums[i]);
             if(i>=max){
                return false;
            }
        }
        
        return true;
    }
}