class Solution {
    public int longestBalanced(String s) {
     int n = s.length();
     int max = 0;
     for(int i = 0;i<n;i++){
     HashMap<Character,Integer> mp  = new HashMap<>();
     for(int j = i;j<n;j++){
        mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
        boolean same = true;
        int fre = mp.get(s.charAt(j));
        for(char key : mp.keySet()){
            if(fre!=mp.get(key)){
                same = false;
                break;
            }
        }
       if(same){
       max = Math.max(max,j-i+1);
       }
       
     }
     }
     return max;
    }
}