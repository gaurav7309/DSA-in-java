class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        var mp  =  new HashMap<Integer,Integer>();
        int start = 0;
        int max_len = Integer.MIN_VALUE;
        for(int end = 0;end<n;end++){
        mp.put(nums[end],mp.getOrDefault(nums[end],0)+1);

        while(mp.get(nums[end])>k){
            mp.put(nums[start],mp.get(nums[start])-1);
            if(mp.get(nums[start])==0){
                mp.remove(nums[start]);
            }
           start+=1; 

        }
        max_len = Math.max(max_len,end-start+1);
        }
        return max_len;
    }
}