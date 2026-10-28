class Solution {
    public int minimumCardPickup(int[] cards) {
        int n = cards.length;
        var freq_map = new HashMap<Integer,Integer>();
        int start = 0;
        int max_len = Integer.MAX_VALUE;
        for(int end = 0;end<n;end++){
        freq_map.put(cards[end],freq_map.getOrDefault(cards[end],0)+1);
        while(freq_map.size()!=end-start+1){
            max_len = Math.min(max_len,end-start+1);
            int temp = cards[start];
            freq_map.put(temp,freq_map.get(temp)-1);
            if(freq_map.get(temp)==0){
                freq_map.remove(temp);
            }
            start++;
        }
     
        }
        return max_len==Integer.MAX_VALUE?-1:max_len;
    }
}