class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
       int n = nums.length;
       int ans  = 0;
       for(int i = 0;i<n;i++){
        int temp = nums[i];
        while(temp!=0){
            if(temp%10==digit){
            ans++;
            }
            temp/=10;
        }
       } 
       return ans;
    }
}