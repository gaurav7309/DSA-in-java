import java.util.*;
import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        var pq = new PriorityQueue<String>((a, b) ->
            new BigInteger(b).compareTo(new BigInteger(a)));

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            pq.add(nums[i]);
        }

        while (k - 1 != 0) {
            pq.remove();
            k--;
        }

        return pq.remove();
    }
}
