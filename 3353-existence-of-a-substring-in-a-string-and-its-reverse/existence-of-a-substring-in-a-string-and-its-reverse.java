class Solution {
        String  rev(String s){
        StringBuilder st = new StringBuilder(s);
        int p = 0;
        int q = st.length()-1;
        while(p<q){
        char temp  = st.charAt(p);
        st.setCharAt(p,st.charAt(q));
        st.setCharAt(q,temp);
        p++;
        q--;
        }
       return st.toString();
    }
    public boolean isSubstringPresent(String s) {
        int n = s.length();
    HashMap<String,Integer>mp = new HashMap<>();
    for(int i = 0;i<n;i++){
        String temp = "";
        for(int j = i;j<n;j++){
         temp = temp+s.charAt(j);
         mp.put(temp,mp.getOrDefault(temp,0)+1);
        }
    }
       for(int i = 0;i<n;i++){
        String memp = "";
        for(int j = i;j<n;j++){
         memp = memp+s.charAt(j);
         if(memp.length()==2){
         String g = rev(memp);
         if(mp.containsKey(g)){
          return true;
         }
         }
        }
       
    }  
     return false;
    }
}