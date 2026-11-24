class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        return columnTraversal(matrix, target, 0, rows * cols - 1, cols);
    }
    public boolean columnTraversal(int[][] matrix, int target, int si, int ei, int cols) {
        if (si > ei) return false;

        int mid = (si + ei) / 2;
        int row = mid / cols;
        int col = mid % cols;

        if (matrix[row][col] == target) {
            return true;
        } else if (matrix[row][col] > target) {
            return columnTraversal(matrix, target, si, mid - 1, cols);
        } else {
            return columnTraversal(matrix, target, mid + 1, ei, cols);
        }
    }
}
