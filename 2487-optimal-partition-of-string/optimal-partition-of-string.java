class Solution {
    public int partitionString(String s) {
        int n = s.length();
        var check_map = new HashMap<Character,Integer>();
        int start = 0;
        int ans = 0;
        for(int end = 0; end < n; end++) {
            check_map.put(s.charAt(end), check_map.getOrDefault(s.charAt(end), 0) + 1);
            boolean flag = true;
            while((end - start + 1) != check_map.size()) {
                start = end;
                check_map.clear();
                check_map.put(s.charAt(start), 1);
                
                flag = false;
            }
            if(!flag) {
                ans++;
            }
        }
        return ans + 1;
    }
}