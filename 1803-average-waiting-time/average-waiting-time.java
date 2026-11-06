class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int m = customers[0].length;
        double ans = 0;
        int [] temp = new int[n]; 
        int  p = 0;
        int check  = 0;
       for(int [] cust : customers){
        int arr  = cust[0];
        int time = cust[1];
        check = Math.max(check,arr)+time;
        temp[p++] = check-arr;

       }
       for(int i = 0;i<temp.length;i++){
        ans+=temp[i];
       }
       return ans/n;
    }
}