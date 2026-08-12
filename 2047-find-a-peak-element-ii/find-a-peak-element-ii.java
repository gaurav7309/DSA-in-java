class Solution {
    public int[] findPeakGrid(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;
    int [] ans = new int [2];
    for(int i = 0;i<m;i++){
    for(int j = 0;j<n;j++){
       int top = -1; int left = -1;
       int right = -1; int bottom = -1;
       if(i>0){
        top = mat[i-1][j];
       }
       if(j>0){
        left = mat[i][j-1];
       }
       if(i<m-1){
       bottom = mat[i+1][j];
       }
       if(j<n-1){
        right = mat[i][j+1];
       }
        if(mat[i][j]>top&& mat[i][j]>bottom && mat[i][j]>left && mat[i][j]>right ){
         ans[0] = i;  ans[1] = j;
         return ans;
        }  
        }
    } 
return ans;
    }
}