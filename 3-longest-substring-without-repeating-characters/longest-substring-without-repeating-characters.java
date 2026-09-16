class Solution {
    public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int max = 0;
    for(int i = 0;i<n;i++){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int j = i;j<n;j++){
        if(!mp.containsKey(s.charAt(j))){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(i),0)+1);

        }
        else {
            break;
        }
        }
        max =  Math.max(max,mp.size());
    }
    return max;
    }
}