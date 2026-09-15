class Solution {
    public int minCost(int n) {
     int p = 1;
     int sum = 0;
     int x = 2;
     for(int i  = 1;i<n;i++){
     if(p+i==x){
        sum+=p*i;
     }
     x++;
     }   
     return sum;
    }
}