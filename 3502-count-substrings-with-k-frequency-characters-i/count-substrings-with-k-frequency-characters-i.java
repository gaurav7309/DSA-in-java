class Solution {
    public int numberOfSubstrings(String s, int k) {
    int n = s.length();
    int count = 0;
    for(int i = 0;i<n;i++){
        HashMap<Character,Integer>mp = new HashMap<>();
        for(int j = i;j<n;j++){
        mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1); 
        if(mp.get(s.charAt(j))==k){
        for(int k1 = j;k1<n;k1++){
        count++;
        }
        break;
        }
       
         
        
        }
    } 
    return count;   
    }
}