class Solution {
    public int minOperations(int[] nums, int[] locked, int k) {
      
      int n = nums.length;
      int ans = 0;
      int lock = 0;
      for(int i  = 0;i<n-1;i++){
        for(int j = 0;j<n-1-i;j++){
            boolean falg  = true;
        if(nums[j]>nums[j+1]){
            int temp = nums[j];
            if(locked[j]==1){
                locked[j] = 0;
                lock++;
            }
            if(locked[j+1]==1){
                lock++;
                    locked[j+1] = 0;
            }
            nums[j] = nums[j+1];
            nums[j+1] = temp;
            falg = false;
        }
        if(!falg){
        ans++;
        }
        }
      }
      if(lock>k){
        return -1;
      }
      return ans+lock;

    }
}