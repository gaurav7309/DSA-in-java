class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> mp = new HashMap<>();
       HashMap<Character,Integer> mp1 = new HashMap<>();
       int n = s.length();
       int m = t.length();
       if(n!=m){
        return false;
       }
       for(int i =  0;i<n;i++){
       mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
       } 
        for(int i =  0;i<m;i++){
        mp1.put(t.charAt(i),mp1.getOrDefault(t.charAt(i),0)+1);
       } 
        if(mp.size()!=mp1.size()){
            return false;
        }
       for(int i = 0;i<m;i++){
        if(!mp.containsKey(t.charAt(i))){
            return false;
        }
       }
       for(char key:mp.keySet()){
        if(!mp.get(key).equals(mp1.get(key))){
            return false;
        }
       }

       return true;
    }
}