class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int n = nums.length;
      double max = Integer.MIN_VALUE;
     int sum = 0;
     int p = 0;
      for(int i = 0;i<k;i++){
      sum+=nums[i];
      
      }  
       double avg = (double)sum/k;
       max = Math.max(max,avg);

       int p1 = 0;
       for(int i = k;i<n;i++){
       sum-=nums[p1++];
       sum+=nums[i];
       max = Math.max(max,(double)sum/k);
       }
       return max;

    }
}