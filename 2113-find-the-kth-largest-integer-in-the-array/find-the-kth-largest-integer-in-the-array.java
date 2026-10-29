import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
       var pq = new PriorityQueue<BigInteger>(Collections.reverseOrder());
       int n = nums.length;
       for(int i = 0;i<n;i++){
        pq.add(new BigInteger(nums[i]));

       } 
       while(k-1!=0){
        pq.remove();
        k--;
       }
       return pq.remove().toString();
    }
}