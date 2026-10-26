class Solution {
    public int characterReplacement(String s, int k) {
       int n = s.length();
       String st = "";
       HashMap<Character,Integer> mp = new HashMap<>();
       int start = 0;
       int max = Integer.MIN_VALUE;
       int result = Integer.MIN_VALUE;
       for(int end = 0;end<n;end++){
       mp.put(s.charAt(end),mp.getOrDefault(s.charAt(end),0)+1);
       st+=s.charAt(end);
       max = Math.max(max,mp.get(s.charAt(end)));

       while((end-start+1)-max>k){
       char temp = st.charAt(start);
       mp.put(temp,mp.get(temp)-1);
       
       if(mp.get(temp)==0){
        mp.remove(temp);
       }
       start++;
       }
      result = Math.max(result,end-start+1);
       } 
       return result;
    }
}