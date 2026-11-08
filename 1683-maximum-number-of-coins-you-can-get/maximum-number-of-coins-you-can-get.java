class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int ans = 0;
        int p = 0;
        for(int i = 0;i<n/3;i++){
         int max = Math.max(piles[i],piles[n-i-p-2]);
         ans+=max;
         p++;
        }
        return ans;
    }
}