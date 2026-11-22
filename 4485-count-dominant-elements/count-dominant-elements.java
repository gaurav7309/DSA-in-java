class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        int ans = 0;
        if(n==1){
            return 1;
        }
        for(int i = 0;i<n;i++){
            if(i==0){
            if(nums[i]>=nums[i+1]){
                ans++;
            }
            }
             else if(i>0 && i+1<n && (2*nums[i]>=(nums[i+1]+nums[i-1]))){
                 ans++;
             }
             
            else if(i==n-1){
                if( nums[i]>=nums[i-1]){
                    ans++;
                }
            }
           
        }
        return ans;
    }
}