class Solution {
    public int maxProfit(int[] prices) {
     // 1.0 first each of the time we have to check smallest and the greatest ele 
     // store the diff and the 
     // each of the diff find out the max ele
     int n = prices.length;
     int max = 0;
     int min = prices[0];
     for(int i = 1;i<n;i++){
     int diff = prices[i]-min;
     max = Math.max(max,diff);
     min  = Math.min(min,prices[i]);
     }  
     return max;
    }
}