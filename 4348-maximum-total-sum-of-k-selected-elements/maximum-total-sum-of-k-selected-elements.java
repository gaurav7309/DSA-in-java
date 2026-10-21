class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n = nums.length;
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       long tot_sum   = 0;
       int p = 0;
       for(int i = 0;i<n;i++){
        pq.add(nums[i]);
        
       }
      
        while(pq.size()>0 && p<k){
        if(mul!=0){
        tot_sum+=(long)pq.remove()*mul;
        mul--;
        }
        else{
         tot_sum+=pq.remove();    
        }
        p++;
        }

       
       return tot_sum;
    } 
}