class Solution {
    public int findKthLargest(int[] nums, int k) {
      //  1st approach of the element
    //    Arrays.sort(nums);
    //    return nums[nums.length-k];
       
       // 2nd approach of the this question for the finding the ans
     
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int ele : nums){
       pq.add(ele);
       if(pq.size()>k){
        pq.remove();
       }
       }
       return pq.peek();
    }
}