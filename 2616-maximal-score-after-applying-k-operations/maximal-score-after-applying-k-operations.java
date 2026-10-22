class Solution {
    public long maxKelements(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int i = 0;i<n;i++){
        pq.add(nums[i]);
       }
       long score = 0;
       int p = 0;
       while(pq.size()!=0 && p<k){
       score+=pq.peek();
       int temp = pq.remove();
       double  memp = (double)temp/3;
       int ans =(int) Math.ceil(memp);
       pq.add(ans);
       p++;
       }
       return score;
    }
}