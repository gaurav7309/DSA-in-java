class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
       char [] temp = s.toCharArray(); 
       int ans = 0;
      
      boolean flag = true;
     for(int i = 0;i<n;i++){
        HashMap<Character,Integer> mp = new HashMap<>(); 
        for(int j = i;j<n;j++){
       if(!mp.containsKey(temp[j])){
        mp.put(temp[j],mp.getOrDefault(temp[j],0)+1);
        }
         if(j-i+1 == 3 && mp.size()==3){
            ans++;
        }
      
       
        }
    
    
     }   
     return ans;
    }
}