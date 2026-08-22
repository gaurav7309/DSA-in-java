class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        long[] bit = new long[2 * n + 5];
        int offset = n + 2;
        int sum = 0;
        long ans = 0;
        add(bit, offset, 1);
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                sum++;
            } else {
                sum--;
            }
         ans += query(bit, sum + offset - 1);

            add(bit, sum + offset, 1);
        }
        return ans;
    }
    private void add(long[] bit, int index, long value) {
        while (index < bit.length) {
            bit[index] += value;
            index += index & -index;
        }
    }
    private long query(long[] bit, int index) {
        long ans = 0;

        while (index > 0) {
            ans += bit[index];
            index -= index & -index;
        }
        return ans;
    }
}