class Solution {
    public boolean checkInclusion(String pattern, String s2) {
       int n = pattern.length();
       int start = 0;
       var pattern_Map = new HashMap<Character,Integer>();
       int match = 0;
      for(int i = 0;i<n;i++){
      pattern_Map.put(pattern.charAt(i),pattern_Map.getOrDefault(pattern.charAt(i),0)+1);

      }
      
      for(int end = 0;end<s2.length();end++){
        char curr = s2.charAt(end);
        // strat opeartion when the elemnt are the present int he map then we reduce thier freq and when the that element fre in the map has the 0 then we increase the match variable

        if(pattern_Map.containsKey(curr)){
            pattern_Map.put(curr,pattern_Map.get(curr)-1);
            if(pattern_Map.get(curr)==0){
            match++;
} 
        else if(pattern_Map.get(curr)==-1){
    match--;
}
        }
        // if the size of the map are the same as the match variable 
        if(match==pattern_Map.size()){
            return true;
        }
        // scrink logic
        
        if(end>=n-1){
            char left = s2.charAt(start);
            if (pattern_Map.containsKey(left)) {
            if (pattern_Map.get(left) == 0) {
            match--;
            } else if (pattern_Map.get(left) == -1) {
             match++;
             }

           pattern_Map.put(left, pattern_Map.get(left) + 1);
           }
           
            start++;
        }
        
      }
      return false;
    }
}