class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        int n = s.length();
        
        int max = 0;
        StringBuilder st = new StringBuilder();
      for(int i = 0;i<n;i++){
      st.append(s.charAt(i));
      h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
      if(st.length()==h.size()){
        max = Math.max(max,st.length());
      }
      else{
        boolean flag = true;

        while(flag){
       char temp = st.charAt(0);
       st.deleteCharAt(0);
       h.put(temp,h.getOrDefault((temp),0)-1);
       if(h.get(temp)==0){
        h.remove(temp);
       }
        if(st.length()==h.size()){
            max = Math.max(max,st.length());
            flag  = false;
        }
        else{
            flag = true;
        }
        }
      }

      }
     return  max;
    }
}