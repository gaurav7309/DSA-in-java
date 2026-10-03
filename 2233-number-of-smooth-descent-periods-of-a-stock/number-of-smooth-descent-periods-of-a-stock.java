class Solution {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long c = 0;
        long len = 1;

        for(int i = 1; i < n; i++) {
            if(prices[i - 1] - prices[i] == 1) {
                len++;
            }
            else {
                len = 1;
            }
            c += len;
        }
        return c + 1;
    }
}