class Solution {
    public int smallestRangeI(int[] nums, int k) {
     int n = nums.length;
     if(n==1){
        return 0;
     }
     Arrays.sort(nums);
     nums[0] = nums[0]+k; 
     for(int i = 1;i<n;i++){
     int x = nums[0]-nums[i];
     if(x<=k && x>=-k){
      nums[i] = nums[i]+x;  
     }
     else{
      nums[i] = nums[i]-k;
     }
     }  
     // perfrm the actin in the new assgin array
     int min  = Integer.MAX_VALUE;
     int max  = Integer.MIN_VALUE;
     for(int i = 0;i<n;i++){
     if(min>nums[i]){
        min = nums[i];
     }
     if(max<nums[i]){
        max = nums[i];
     }
     }
     return (max-min); 
    }
}