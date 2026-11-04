class Solution {
    public int minSubarray(int[] nums, int p) {
        // using thr brute forcw approach
    //     long sum = 0;
    //       int n = nums.length;
    //     for(int i = 0;i<n;i++){
    //     sum+=(long)nums[i];
    //     }

    //     if(sum%p==0){
    //         return 0;
    //     }
    //     int min_len = Integer.MAX_VALUE;
      
    //     for(int i = 0;i<n;i++){
    //         long sum1 = 0;
    //     for(int j = i;j<n;j++){
    //        sum1+=(long)nums[j];
    //        if((sum-sum1)%p==0){
    //         min_len = Math.min(min_len,j-i+1);
    //        }
    //     }
    //     }
    //    return min_len == Integer.MAX_VALUE || min_len == n ? -1 : min_len;

          int n = nums.length;
          long sum = 0;
          for(int i = 0;i<n;i++){
          sum+=nums[i];
          }
          long rem = (sum%(long)p);
            if(rem==0){
                return 0;
            }
          HashMap<Long,Integer> mp = new HashMap<>();
           mp.put(0L, -1);
          long curr_sum1 = 0;
          int min_len = Integer.MAX_VALUE;
          for(int i = 0;i<n;i++){
          curr_sum1 = (curr_sum1+nums[i])%p;
          
       
          
          long check =  (curr_sum1-rem+p)%p;
          if(mp.containsKey(check)){
          min_len = Math.min(min_len,i-mp.get(check));
          }
             mp.put(curr_sum1,i);
          }
          
         return min_len==Integer.MAX_VALUE || min_len==n?-1:min_len;
    }
}