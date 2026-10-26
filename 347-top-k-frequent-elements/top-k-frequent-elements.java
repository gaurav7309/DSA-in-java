class Solution {
    public static class pair{
        int key;
        int freq;
        pair(int key,int freq){
            this.key = key;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
      var pq = new PriorityQueue<pair>((a,b)->{
        if(a.freq==b.freq){
            return Integer.compare(a.key,b.key);
        }
     return Integer.compare(a.freq,b.freq);
      });  
       var mp = new HashMap<Integer,Integer>();
       int n = nums.length;
       for(int i = 0;i<n;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        
        }
        for(int key1: mp.keySet()){
        pq.add(new pair(key1,mp.get(key1)));
        if(pq.size()>k){
            pq.remove();
        }}
        var ans = new int[k];
        int  p = 0;
        while(pq.size()!=0){
        pair temp = pq.remove();
        ans[p++] = temp.key;
        }
        return ans;
       
    }
}