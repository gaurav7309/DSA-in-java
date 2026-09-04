class Solution {
    public int firstStableIndex(int[] nums, int k) {
     int n = nums.length;
     int[]  ans = new int[n];
     if(n==1){
        return 0;
     }
     int max = Integer.MIN_VALUE;
     for(int  i = 0;i<n;i++){
     max = Math.max(max,nums[i]);  
     
     int min  = Integer.MAX_VALUE;
     for(int j = i;j<n;j++){
     min = Math.min(min,nums[j]); 
     }
     int temp = max-min;
     ans[i] = temp;
     }
     // check that the value is present less or equal to the k
     for(int i = 0;i<n;i++){
     if(ans[i]<=k){
        return i;
     }
     }
     return -1;
    }
}