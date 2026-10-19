class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     int n = nums.length;
     for(int i =  0;i<n;i++){

        pq.add(nums[i]);

     }   
     int  p = 0;
     ArrayList<Integer> arr = new ArrayList<>();
     while(pq.size()>0){
     if(pq.peek()==target){
    
     arr.add(p);
     
     }
      pq.remove();
      p++;
     }
     return arr;
    }
}