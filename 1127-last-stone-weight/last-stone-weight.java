class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int ele : stones){
     pq.add(ele);
    }
    while(pq.size()>=2){
        
        int x = pq.remove();
        
          int y = pq.remove();

        
        if(x==y){
            continue;
        }
        else if(x!=y){
           pq.add(x-y); 
        }
        
    }
    return pq.isEmpty()?0: pq.peek();
}}