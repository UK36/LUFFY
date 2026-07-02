class Solution {
    public int[][] transpose(int[][] matrix) {
        // Fix 1: Check if the matrix is null or completely empty
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }
        
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        int newTotalRows = totalCols;
        int newTotalCols = totalRows; // Fixed a small typo in variable name here too

        int[][] ans = new int[newTotalRows][newTotalCols];

        // Actual logic
        for (int i = 0; i < totalRows; i++) {
            // Fix 2: Loop through totalCols, since 'j' accesses the original matrix's columns
            for (int j = 0; j < totalCols; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}