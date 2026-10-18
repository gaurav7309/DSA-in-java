class Solution {
    public int[] lastVisitedCell(char[][] grid) {
      int n = grid.length;
      int m = grid[0].length;
      int temp = 0;
      int memp = 0;
      boolean [][] arr = new boolean[n][m];
      arr[0][0] = true;
        while(true){
            int row = temp;
            int col = memp;
        if(grid[temp][memp]=='R'){
            memp++;
        }
        else if(grid[temp][memp]=='L'){
            memp--;
        }
        else if(grid[temp][memp]=='D'){
        temp++;
       }
       else if(grid[temp][memp]=='U'){
        temp--;
       }
       if(temp<0 || temp>=n || memp<0 || memp>=m || arr[temp][memp]){
        return new int[]{row,col};
       }
       arr[temp][memp] = true;
      
        }}
}