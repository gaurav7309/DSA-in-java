class Solution {
    public int minOperations(int[] nums) {
     int n  = nums.length;
     int ans = 0;
     for(int i = 0;i<=n-3;i++){
       if(nums[i]==0){
        for(int j = i;j<i+3;j++){
            if(nums[j]==0){
                nums[j] = 1;
            }
            else{
                nums[j] = 0;
            }
        }
        ans++;
       } 
     }  
     // check weather the array becomes the 1b  in evry element
     for(int i = 0;i<n;i++){
        if(nums[i]!=1){
         return -1;
        }
     }
     return ans;
    }
}