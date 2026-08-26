class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      int n = jewels.length();
      int m = stones.length();
      int c = 0; 
    
     for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
        if(jewels.charAt(i)==stones.charAt(j)){
            c++;
        }
        }
     }
      
      return c;
    }
}