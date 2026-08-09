class Solution {
    public double minPrice(int[] prices, int[] discounts) {
     Arrays.sort(prices);
     Arrays.sort(discounts); 
     double sum = 0;
     int m = discounts.length-1;
     for(int i = prices.length-1;i>=0;i--){
        int temp = 0;
        if(m>=0){
        temp = discounts[m];
        }
       double temp1 = (prices[i]*(100-temp))/100.0;
        sum+=temp1;
        m--;
     }
     return sum;
    }
}