class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int c = 0;

        if (k <= 1) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            long p = 1;

            for (int j = i; j < n; j++) {
                p *= nums[j];

                if (p < k) {
                    c++;
                } else {
                    break;
                }
            }
        }

        return c;
    }
}