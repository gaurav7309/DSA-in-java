class Solution {
    public int findFinalValue(int[] nums, int original) {
    int n = nums.length;
    int  p = 1;
    for(int i = 0;i<n;i++){
        int ans = original*(p);
        boolean flag = false;
        for(int j = 0;j<n;j++){
            if(nums[j]==ans){
               flag = true;
            }
            if(flag==true){
              break;
            }
            else{
                continue;
            }
        }
        if(flag!=true){
            return ans;
        }
     p*=2;
    }
    return original*p;    
    }
}