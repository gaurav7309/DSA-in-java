class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add((long) nums[i] * n + i);
        }
        long ans = 0;
        while (!pq.isEmpty()) {
            long temp = pq.remove();

            int val = (int) (temp / n);
            int i = (int) (temp % n);

            if (nums[i] == -1) {
                continue;
            }
            ans += val;
            nums[i] = -1;

            if (i - 1 >= 0) {
                nums[i - 1] = -1;
            }
            if (i + 1 < n) {
                nums[i + 1] = -1;
            }
        }

        return ans;
    }
}