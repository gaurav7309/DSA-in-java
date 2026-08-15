class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
    int n   = nums.length;
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<n;i++){
    if(max<nums[i]){
        max = nums[i];
    }
    } 
    // storing the frequncy of the element

    int [] arr = new int [max+1];
    for(int i = 0;i<n;i++){
       arr[nums[i]]++; 
    } 
    int [] ans = new int [2];
    for(int i = 0;i<arr.length-1;i++){
       for(int j = i+1;j<arr.length;j++){
        if(arr[i]!=0 && arr[j]!=0 && i<j && arr[i]!=arr[j]){
            ans[0] = i;
            ans[1] = j;
            return ans;
        }
       }
    }
    ans[0] = -1;
    ans[1] = -1;
    return ans;
    }
}