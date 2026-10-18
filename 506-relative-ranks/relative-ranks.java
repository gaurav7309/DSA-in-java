class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0;i<n;i++){
         pq.add(score[i]);   
        } 
         int  p = 0;
        String[] ans = new String[n];
        while(pq.size()!=0){
            int temp  = pq.remove();
            p++;
            for(int i = 0;i<n;i++){
                if(temp==score[i]){
                 if(p==1){
                  ans[i] =  "Gold Medal"; 
                 }
                 else if(p==2){
                    ans[i] = "Silver Medal";
                 }
                 else if(p==3){
                    ans[i] = "Bronze Medal";
                 }
                 else{
                    ans[i] = Integer.toString(p);
                 }
                }
            }
        }
        return ans;
    }
}