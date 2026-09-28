class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
      int[] arr = new int[2];
      int n = mat.length;
      int m = mat[0].length;
      int max = Integer.MIN_VALUE;
      int row = 0;
      for(int i = 0;i<n;i++){
       
        int one = 0;        
        for(int j = 0;j<m;j++){
            if(mat[i][j]==1){
            one++;
            }
            if(max<one){
                max = one;
                row = i;
            }

            
        }
      }  
      arr[0] = row;
      arr[1]  = max;
      return arr;
    }
}