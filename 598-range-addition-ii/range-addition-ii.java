class Solution {
    public int maxCount(int m, int n, int[][] ops) {
    // int [][] ope = new int[m][n];

    // for(int [] op : ops){
    //     int row = op[0];
    //     int col = op[1];
    // for(int i = 0;i<row;i++){
    //     for(int j = 0;j<col;j++){
    //     ope[i][j] = ope[i][j]+1;
    //     }
    // }
    // }
    // // find the max element 
    // int max = Integer.MIN_VALUE;
    // for(int i = 0;i<m;i++){
    //     for(int j = 0;j<n;j++){
    //     max = Math.max(max,ope[i][j]);
    //     }
    // }
    // // find the all the max elemnt int he  ope grid
    // int ans = 0;
    //     for(int i = 0;i<m;i++){
    //     for(int j = 0;j<n;j++){
    //     if(max==ope[i][j]){
    //     ans++;
    //     }
    //     }
    // }
    // return ans;

    int n1 = ops.length;
    if(n1==0){
        return m*n;

    }
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE; 
     for(int [] op : ops){
     min1 = Math.min(min1,op[0]);
     min2 = Math.min(min2,op[1]);
    }
     return min1*min2;
    }
}