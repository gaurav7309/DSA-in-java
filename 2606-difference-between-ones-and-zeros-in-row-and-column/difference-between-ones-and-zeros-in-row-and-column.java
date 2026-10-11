class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
    //   int n =   grid.length;
    //   int m = grid[0].length;
    //   int [] rowone = new rowone[n];
    //   int [] colone = new colone[m];

    //   for(int i = 0;i<n;i++){
    
    //     for(int j = 0;j<m;j++){
    //     int onesRow = 0, onesCol = 0;
    //     int zerosRow = 0, zerosCol = 0; 
    //         for(int k = 0;k<m;k++){
    //         if(grid[i][k]==1){
    //             onesRow++;
               
    //         }
    //         else if(grid[i][k]==0){
    //            zerosRow++;  
    //         }
    //         }
    //         for(int k = 0;k<n;k++){
    //          if(grid[k][j]==1){
    //             onesCol++;
    //         }
    //         else{
    //             zerosCol++;
    //         }
    //         }
    //         mat[i][j] = onesRow + onesCol - zerosRow - zerosCol;
    //     }
        
    //   }
    //   for(int i = 0;i<n;i++){
    //   for(int j = 0;j<m;j++){
    //     grid[i][j] = mat[i][j];
    //   }
    //   }
    //   return grid;

    // Another method for the solving this probelm

    int n =   grid.length;
      int m = grid[0].length;
      int [] rowone = new int [n];
      int [] colone = new int [m];
      for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            if(grid[i][j]==1){
                rowone[i]++;
                colone[j]++;
            }
        }
      }
      
      for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
          int zerosRowi = m-rowone[i];
          int zerosColj = n-colone[j];
          grid[i][j] = rowone[i]+colone[j]- zerosRowi-  zerosColj;
        }
      }
      return grid;
    }
}