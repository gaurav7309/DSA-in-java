class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
      int n = nums.length;
      var pq = new PriorityQueue<Integer>(Collections.reverseOrder());
      for(int i = 0;i<n;i++){
        pq.add(nums[i]);

      }
      
      var temp = new ArrayList<Integer>();
      while(k!=0){
        temp.add(pq.remove());
        k--;
      }
      var ans = new int[temp.size()];
      int o = 0;
      for(int i = 0;i<n;i++){
      if(temp.contains(nums[i])){
        int index = temp.indexOf(nums[i]);
        if(index!=-1){
        temp.remove(index);
        ans[o++] = nums[i];
      }
      if(o==k){
        break;
      }
      }
      }

    return ans;
    }
}