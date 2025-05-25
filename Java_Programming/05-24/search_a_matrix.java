// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

public class search_a_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 6;
        System.out.println(searchMatrix(matrix, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (matrix[0][0] > target || matrix[row - 1][col - 1] < target) {
            return false;
        }
        int i = row - 1;
        int j = 0;

        while (i >= 0 && j < col) {
            int num = matrix[i][j];
            if (num > target) {
                i--;
            } else if (num < target) {
                j++;
            } else if (num == target) {
                return true;
            }
        }
        return false;
    }
}
