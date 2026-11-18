class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n  = grid.length;
        int m = grid[0].length;
        int [][] ans = new int [n][m];
        int p  = n-1;
        for(int i  = p;i>=0 ;i--){
            int q = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int j = i;j<n && q<m;j++){
            arr.add(grid[j][q]);
            q++;
        }
        Collections.sort(arr,Collections.reverseOrder());
        
         // store that sorted part of the array into ans
         int  s = 0;
         int arrlen  = arr.size();
         int start = 0;
         for(int j = i;j<n && s<m && start<arrlen;j++){
            // arr.add(grid[j][q]);
            ans[j][s] = arr.get(start);
            s++;
            start++;
            
        }


        }
        // for the upper daigonal of the matrix apply the same condition

        for(int i = 1;i<m;i++){
         ArrayList<Integer> arr = new ArrayList<>(); 
         int  g = 0;
         for(int j = i;j<m && g<n ; j++){
              arr.add(grid[g][j]);
              g++;
         }
           Collections.sort(arr); // sort the daigonal in the reverse order        }

         int  s = 0;
         int arrlen  = arr.size();
         int start = 0;

            for(int j = i;j<m && p<n && start<arrlen;j++){
             ans[s][j] = arr.get(start);
             start++;
             s++;
         }
        }
          return ans;
    }
}