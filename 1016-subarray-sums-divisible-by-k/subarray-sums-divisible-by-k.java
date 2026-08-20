class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     int n = nums.length;
     int [] freq = new int[k];
     freq[0] = 1;
     int c = 0;
     int sum = 0;
     for(int i = 0;i<n;i++){
     sum+=nums[i];
     int rem = sum%k;
     if(rem<0){
        rem+=k;
     } 
     c+=freq[rem];
     freq[rem]++;
     }  
     return c; 
    }
}