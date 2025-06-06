// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.

public class search_a_matrix1 {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;

        System.out.println(searchMatrix(matrix, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (matrix[0][0] > target || matrix[row - 1][col - 1] < target) {
            return false;
        }
        int i = 0;
        int j = col-1;

        while(i < row && j >= 0){
            if(matrix[i][j] == target){
                return true;
            } else if(target < matrix[i][j]){
                j--;
            } else if(target > matrix[i][j]){
                i++;
            }
        }
        return false;
    }
}
