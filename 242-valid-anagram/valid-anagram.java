class Solution {
    public boolean isAnagram(String s, String t) {
     HashMap<Character,Integer> ans1 = new HashMap<>();
     HashMap<Character,Integer> ans2 = new HashMap<>();
     int n = s.length();
     int e = t.length();
     if(n!=e){
     return false;
     }
     for(int i = 0;i<n;i++){
      ans1.put(s.charAt(i),ans1.getOrDefault(s.charAt(i),0)+1);
      ans2.put(t.charAt(i),ans2.getOrDefault(t.charAt(i),0)+1);
     }  
     // iterate in the mps
     for(char key : ans1.keySet()){
        if(!ans1.get(key).equals(ans2.get(key))){
             return false;
        }
     } 
      return true;
    }
   
}