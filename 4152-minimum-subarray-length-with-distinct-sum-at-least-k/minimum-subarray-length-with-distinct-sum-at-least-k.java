import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int minLength(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= k) {
                return 1;
            }
        }
        
        var arr = new ArrayList<Integer>();
        var mp = new HashMap<Integer, Integer>();
        int min = Integer.MAX_VALUE;
        long check = 0; 
        
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            arr.add(val);
            
          
            mp.put(val, mp.getOrDefault(val, 0) + 1);
        
            if (mp.get(val) == 1) {
                check += val;
            }
            while (check >= k && !arr.isEmpty()) {
                min = Math.min(min, arr.size());
                
                int temp = arr.remove(0);
                mp.put(temp, mp.get(temp) - 1);
                
                if (mp.get(temp) == 0) {
                    mp.remove(temp);
                    check -= temp;
                }
            }
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}