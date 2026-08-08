class Solution {
    void swap(int [] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public int minimumSwaps(int[] nums) {
    int n = nums.length;
    int p = 0; int q = n-1;
    int c = 0;
    while(p<q) {
     if(nums[p]==0 && nums[q]!=0){
     swap(nums,p,q);
     c++;
     p++; q--;
     }  
     else if(nums[p]==0 && nums[q]==0){
        q--;
     } 
     else if(nums[p]!=0 && nums[q]!=0){
        p++;
     }
     else{
        p++;
        q--;
     }
    }
    return c;
    }
}