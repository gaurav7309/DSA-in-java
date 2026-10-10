
import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            mp.putIfAbsent(nums[i], new ArrayList<>());
            ArrayList<Integer> TA = mp.get(nums[i]);

            TA.add(i);

            if(TA.size() >= 3) {
                int p = TA.size();
                int sum = Math.abs(TA.get(p - 3) - TA.get(p - 2))
                        + Math.abs(TA.get(p - 2) - TA.get(p - 1))
                        + Math.abs(TA.get(p - 3) - TA.get(p - 1));

                min = Math.min(min, sum);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
