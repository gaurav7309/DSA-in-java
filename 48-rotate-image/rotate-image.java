class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 1. Create a copy of the original matrix so reads aren't corrupted by writes
        int[][] copy = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = matrix[i][j];
            }
        }

        // 2. Map elements from copy to matrix using your row/col mapping
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Sourcing element that rotates into (i, j)
                matrix[i][j] = copy[n - 1 - j][i];
            }
        }
    }
}