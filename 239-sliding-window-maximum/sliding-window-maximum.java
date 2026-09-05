import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> Q = new LinkedList<>();
        int i = 0;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();

        while(i < n) {

            // remove elements outside the window
            while(!Q.isEmpty() && Q.peekFirst() <= i - k) {
                Q.removeFirst();
            }

            // remove smaller elements
            while(!Q.isEmpty() && nums[Q.peekLast()] <= nums[i]) {
                Q.removeLast();
            }

            Q.addLast(i);

            if(i >= k - 1) {
                max = nums[Q.peekFirst()];
                arr.add(max);
            }

            i++;
        }

        int[] ans = new int[arr.size()];

        for(int p = 0; p < arr.size(); p++) {
            ans[p] = arr.get(p);
        }

        return ans;
    }
}