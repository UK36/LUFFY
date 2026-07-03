class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> result = new ArrayList<>();
        int startingRow = 0;
        int endingRow = n - 1;
        int startingCol = 0;
        int endingCol = m - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            // top row: left -> right
            for (int Col = startingCol; Col <= endingCol; Col++) {
                result.add(matrix[startingRow][Col]);
            }
            startingRow++;

            // right col: top -> bottom
            for (int row = startingRow; row <= endingRow; row++) {
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

            // bottom row: right -> left (only if a row remains)
            if (startingRow <= endingRow) {
                for (int Col = endingCol; Col >= startingCol; Col--) {
                    result.add(matrix[endingRow][Col]);
                }
                endingRow--;
            }

            // left col: bottom -> top (only if a col remains)
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }
        return result;
    }
}