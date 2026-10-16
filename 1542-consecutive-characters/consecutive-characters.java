class Solution {
    public int maxPower(String s) {
        
      int n = s.length();
      int max = 0;
      for(int i = 0;i<n;i++){
        HashSet<Character> mp = new HashSet<>(); 
        for(int j = i;j<n;j++){
        mp.add(s.charAt(j));
        if(mp.size()==1){
            max = Math.max(max,j-i+1);
        }
        }}
        return max;
    }
}