import java.util.*;

class Solution {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {

        int n = nums1.length;
        long[] ans = new long[n];

        // {nums1 value, nums2 value, original index}
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums1[i];
            arr[i][1] = nums2[i];
            arr[i][2] = i;
        }

        // Sort according to nums1
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Min heap -> keeps k largest nums2 values
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        long sum = 0;
        int i = 0;

        while (i < n) {

            int j = i;

            // Same nums1 values must get the same answer
            while (j < n && arr[j][0] == arr[i][0]) {
                ans[arr[j][2]] = sum;
                j++;
            }

            // Add nums2 values of this group
            for (int x = i; x < j; x++) {

                int value = arr[x][1];

                pq.offer(value);
                sum += value;

                if (pq.size() > k) {
                    sum -= pq.poll();
                }
            }

            i = j;
        }

        return ans;
    }
}