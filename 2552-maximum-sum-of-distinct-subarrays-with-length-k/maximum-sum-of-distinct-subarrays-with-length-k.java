class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> st = new HashMap<>();
        long sum = 0;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            st.put(nums[i], st.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
        }
        if (st.size() == k) {
            max = Math.max(max, sum);
        }
        int p = 0;
        for (int i = k; i < n; i++) {
            int t = nums[p];
            sum -= t;
            st.put(t, st.get(t) - 1);
            if (st.get(t) == 0) {
                st.remove(t);
            }
            p++;

            st.put(nums[i], st.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];

            if (st.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max == Long.MIN_VALUE ? 0 : max;
    }
}