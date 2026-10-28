class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int start = 0;
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        var freq_map = new HashMap<Integer,Integer>();
        for(int end = 0;end<n;end++){
        sum+=nums[end];
        freq_map.put(nums[end],freq_map.getOrDefault(nums[end],0)+1);
        while(freq_map.size()!=end-start+1){
            int temp = nums[start];
            sum-=temp;
            freq_map.put(temp,freq_map.get(temp)-1);
            if(freq_map.get(temp)==0){
                freq_map.remove(temp);
            }
            start++;
        }
        max_sum = Math.max(max_sum,sum);
        }
        return max_sum;
    }
}