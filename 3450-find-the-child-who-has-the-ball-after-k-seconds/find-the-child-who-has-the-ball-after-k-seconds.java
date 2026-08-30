class Solution {
    public int numberOfChild(int n, int k) {

        int k1 = k % (2 * (n - 1));

        if (k1 < n) {
            return k1;
        } else {
            return 2 * (n - 1) - k1;
        }
    }
}