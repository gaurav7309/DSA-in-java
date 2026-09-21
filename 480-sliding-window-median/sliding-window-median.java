class Solution {
    TreeMap<Integer, Integer> left = new TreeMap<>();
    TreeMap<Integer, Integer> right = new TreeMap<>();
    int ls = 0, rs = 0;
    void add(TreeMap<Integer, Integer> map, int x) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }
    void remove(TreeMap<Integer, Integer> map, int x) {
        if (map.get(x) == 1) map.remove(x);
        else map.put(x, map.get(x) - 1);
    }
    void balance() {
        while (ls > rs + 1) {
            int x = left.lastKey();
            remove(left, x);
            add(right, x);
            ls--;
            rs++;
        }
        while (rs > ls) {
            int x = right.firstKey();
            remove(right, x);
            add(left, x);
            rs--;
            ls++;
        }
    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] ans = new double[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            if (left.isEmpty() || nums[i] <= left.lastKey()) {
                add(left, nums[i]);
                ls++;
            } else {
                add(right, nums[i]);
                rs++;
            }
        }
        balance();
        for (int i = 0; i < ans.length; i++) {

            if (k % 2 == 1)
                ans[i] = left.lastKey();
            else
                ans[i] = ((long) left.lastKey() + right.firstKey()) / 2.0;

            if (i == ans.length - 1) break;
            int old = nums[i];
            if (left.containsKey(old)) {
                remove(left, old);
                ls--;
            } else {
                remove(right, old);
                rs--;
            }
            int x = nums[i + k];
            if (left.isEmpty() || x <= left.lastKey()) {
                add(left, x);
                ls++;
            } else {
                add(right, x);
                rs++;
            }
            balance();
        }
        return ans;
    }
}