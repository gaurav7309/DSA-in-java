class Solution {
    public int longestSubstring(String s, int k) {
     /* first we have  to generate the all the substring and the whatevere substing comes that string we have to check each of the charcter that its occurence is the greater or equal to the k  with the help of the hashMap;*/
     int max = 0;
     int n = s.length();
     for(int i = 0;i<n;i++){
      
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int j = i;j<n;j++){
        mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1); 
         boolean flag = true; 
        // each of the time we have to check the occurences
        for(char key : mp.keySet()){
        if(mp.get(key)<k){
        flag = false;
        break;
        }
        }
        // find out the max 
        if(flag==true){
        max = Math.max(max,j-i+1);
        }
        }
     }
      return max;
    }
}