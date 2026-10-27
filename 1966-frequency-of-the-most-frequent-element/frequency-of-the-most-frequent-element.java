class Solution {
    public int maxFrequency(int[] nums, int k) {
       var pre = new int[nums.length];
       Arrays.sort(nums);
       ArrayList<Integer> arr = new ArrayList<>();
 
        int n = nums.length;
        int max= Integer.MIN_VALUE;
        int start = 0;
        long sum = 0;
       for(int end = 0;end<n;end++){
       sum+=nums[end];
       
       while((long)nums[end]*(end-start+1)-sum>k){
       sum-=nums[start];
       start++;
       }
     
       max = Math.max(max,end-start+1);
       
       }
    return max==Integer.MIN_VALUE?1:max;
    }
}