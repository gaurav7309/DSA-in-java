class Solution {
    public int minDeletions(int[] nums) {
    int n  =  nums.length;
    int c = 0;
    for(int i = 0;i<n-1;i++){
        int temp = nums[i]^nums[i+1];
        if(temp==0){
        c++;
        }
    } 
    return c;   
    }
}