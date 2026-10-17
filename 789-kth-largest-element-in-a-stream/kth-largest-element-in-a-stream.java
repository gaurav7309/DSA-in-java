class KthLargest {
    PriorityQueue<Integer> pq;
    int k ;
    public KthLargest(int k, int[] nums) {
     this.pq = new PriorityQueue<>();
     this.k = k;
     for(int ele:nums){
        pq.add(ele);
        if(pq.size()>k){
            pq.remove();
        }
     }
    }
    
    public int add(int val) {
        if( pq.size()==k && pq.peek()>val){
        return pq.peek();
        }
        else{
         pq.add(val);
         if(pq.size()>k){
         int temp = pq.peek();
         pq.remove();
         }
         return pq.peek();

        }
      
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */