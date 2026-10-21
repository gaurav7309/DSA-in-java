class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
       int [] ans = new int[n];
       for(int [] booking : bookings){
        int left = booking[0];
        int right = booking[1];
        int seats  = booking[2];
        ans[left-1] += seats;
        if(right<n){
            ans[right]-=seats;
        }
       
       } 
       for(int i = 1;i<n;i++){
        ans[i] = ans[i]+ans[i-1];

       }

       return ans;
    }
}