class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
    int n = image.length;
    int [][] temp = new int[n][n]; 
    for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            
         if(image[i][j]==1){
            image[i][j] = 0;
           
         }   
         else{
            image[i][j] = 1;
           
         }
         temp[i][n-1-j] = image[i][j];
        }
    }

    return temp;
    }
}