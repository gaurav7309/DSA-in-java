class Solution {
    public int valueAfterKSeconds(int n, int k) {
     Long[] nums = new Long[n];
     for(int i = 0;i<n;i++){
        nums[i] =(long)1;
     }   
     while(k-->0){
        for(int i = 1;i<n;i++){
            nums[i] = (nums[i]+nums[i-1])%1000000007;
        }
     }
     long ans = nums[n-1];
     return (int)ans;
    }
}