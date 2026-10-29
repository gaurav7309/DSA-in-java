class Solution {
    public int maximumScore(int a, int b, int c) {
        var pq = new PriorityQueue<Integer>();
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int ans = 0;
        while(pq.size()>1){
        int min = pq.remove();
        int max = Collections.max(pq);
        pq.remove(max);
        ans++;
       if(max-1>0){
        pq.add(max-1);

       }
       if(min-1>0){
        pq.add(min-1);
       }
         
        
       
        }
        return ans;
    }
}