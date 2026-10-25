class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
       int n =  grid.length;
       int m = grid[0].length;
       var ans = new PriorityQueue<Integer>(Collections.reverseOrder());

       for(int i  = 0;i<n;i++){
       var pq = new PriorityQueue<Integer>();
       for(int j = 0;j<m;j++){
       pq.add(grid[i][j]);
       if(pq.size()>limits[i]){
        pq.remove();
       }
       }

       while(pq.size()!=0){
        ans.add(pq.remove());
       }

       } 
       long result = 0;
       while(k-->0){
       result+=ans.remove();
       }
       return result;
    }
}