class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
      var freq_map = new HashMap<Character,Integer>();
      int start = 0;
      int max_len = Integer.MIN_VALUE;
      for(int end  = 0;end<n;end++){
      freq_map.put(s.charAt(end),freq_map.getOrDefault(s.charAt(end),0)+1);
  
      if(freq_map.size()!=end-start+1){
      char temp = s.charAt(start);
      freq_map.put(temp,freq_map.get(temp)-1);
      if(freq_map.get(temp)==0){
        freq_map.remove(temp);
      }
      start++;
      }
      max_len = Math.max(max_len,end-start+1);
      } 
      return max_len==Integer.MIN_VALUE?0:max_len;
    }
}