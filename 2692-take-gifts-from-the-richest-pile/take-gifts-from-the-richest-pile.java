class Solution {
    public long pickGifts(int[] gifts, int k) {
        var pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int n = gifts.length;
        for(int i = 0;i<n;i++){
        pq.add(gifts[i]);
        }
        while(k-->0){
            int temp = (int)Math.sqrt(pq.remove());
            pq.add(temp);
        }
        long sum = 0;
        while(pq.size()!=0){
        sum+=pq.remove();
        }
        return sum;
    }
}