class Solution {
    public int[] sortedSquares(int[] nums) {
       int [] ans = new int[nums.length];
       int n = nums.length;
       int p = 0; int q = n-1;
       int into = n-1;
       while(p<=q){
        int check1 = nums[p]*nums[p];
        int check2 = nums[q]*nums[q];
        
        if(check1<check2){
            ans[into--] = check2;
            q--;
        }
        else{
            ans[into--] = check1;
            p++;
        }
       } 
       return ans;
    }
}