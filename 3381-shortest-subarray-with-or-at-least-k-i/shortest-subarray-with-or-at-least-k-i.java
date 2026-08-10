class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {

        int n = nums.length;
        int length1 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int or = 0;

            for (int j = i; j < n; j++) {

                or = or | nums[j];

                int length = j - i + 1;

                if (or >= k && length < length1) {
                    length1 = length;
                }
            }
        }

        if (length1 == Integer.MAX_VALUE) {
            return -1;
        }

        return length1;
    }
}