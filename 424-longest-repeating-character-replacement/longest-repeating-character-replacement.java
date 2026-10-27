class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character,Integer> mp = new HashMap<>();
      
        int max = Integer.MIN_VALUE;
        int start = 0;
        int result = Integer.MIN_VALUE;
        for(int end = 0;end<n;end++){
       
        mp.put(s.charAt(end),mp.getOrDefault(s.charAt(end),0)+1);
        max = Math.max(max,mp.get(s.charAt(end)));
        if((end-start+1)-max>k){
        char temp = s.charAt(start);
        mp.put(temp,mp.get(temp)-1);
       

        start++;
        }
        result = Math.max(result,end-start+1);
        }
        return result;
    }
}