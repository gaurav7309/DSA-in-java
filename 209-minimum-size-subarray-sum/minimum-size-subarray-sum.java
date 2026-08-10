class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int left = 0;
        int sum = 0;
        int length1 = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            sum += nums[right];

            while (sum >= target) {

                int length = right - left + 1;

                if (length < length1) {
                    length1 = length;
                }

                sum -= nums[left];
                left++;
            }
        }

        if (length1 == Integer.MAX_VALUE) {
            return 0;
        }

        return length1;
    }
}