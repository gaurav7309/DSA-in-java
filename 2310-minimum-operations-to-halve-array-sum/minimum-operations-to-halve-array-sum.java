class Solution {
    public int halveArray(int[] nums) {
   
      int n = nums.length;
           if(n==1){
            return 1;
           }
      double sum = 0.0;
      var pq = new PriorityQueue<Double>(Collections.reverseOrder());
      for(int i = 0;i<n;i++){
      pq.add(nums[i]/1.0);
      sum=sum+nums[i]/1.0;
      }  
      double half_sum = 0;
      int ans = 0;
      while(half_sum<sum/2.0){
        ans++;
        double temp = pq.remove();
        
        half_sum+=temp/2.0;
        pq.add(temp/2.0);
      }
      return ans;
    }
}