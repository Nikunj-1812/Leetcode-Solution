import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            int min = Integer.MAX_VALUE;
            int colIndex = -1;

            // Find minimum element in current row
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check if it is maximum in its column
            boolean isLucky = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > min) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                list.add(min);
            }
        }

        return list;
    }
}