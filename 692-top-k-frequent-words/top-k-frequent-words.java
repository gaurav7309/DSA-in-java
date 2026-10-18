class Solution {
    public class pair{
        String word;
        int freq;
        pair(String word,int freq){
        this.word = word;
        this.freq = freq;
        }

    }
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
     HashMap<String,Integer> mp = new HashMap<>();
     for(int i = 0;i<n;i++){
        mp.put(words[i],mp.getOrDefault(words[i],0)+1);
     }   
     PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> {
        if(a.freq==b.freq){
            return b.word.compareTo(a.word);
        }
        return a.freq-b.freq;
     });
     for(String key : mp.keySet()){
     pq.add(new pair(key,mp.get(key)));
     if(pq.size()>k){
        pq.remove();
     }
     }
     ArrayList<String> ans = new ArrayList<>();
    while(pq.size()>0){
        pair temp = pq.remove();
        ans.add(temp.word);
    }
     Collections.reverse(ans);
    return ans;
    }
}