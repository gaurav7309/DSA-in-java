class Solution {
    public int minStoneSum(int[] piles, int k) {
      var pq = new PriorityQueue<Integer>(Collections.reverseOrder());
      int n = piles.length;
      for(int i = 0;i<n;i++){
        pq.add(piles[i]);
      }  
      while(k-->0){
      int temp = pq.remove();
      pq.add((int)Math.ceil(temp/2.0));

      }
      int sum = 0;
      while(pq.size()!=0){
     sum+=pq.remove();
      }
      return sum;
    }
}