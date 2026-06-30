class Solution {
    public int[] [] generateMatrix(int n) {
        int[] [] matrix = new int[n] [n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;
        int target = n * n;

        while (num <= target) {
            for (int col = left; col <= right && num <= target; col++) {
                matrix[top] [col] = num++;
            }
            top++;

            for (int row = top; row <= bottom && num <= target; row++) {
                matrix[row] [right] = num++;
            }
            right--;

            for (int col = right; col >= left && num <= target; col--) {
                matrix[bottom] [col] = num++;
            }
            bottom--;

            for (int row = bottom; row >= top && num <= target; row--) {
                matrix[row] [left] = num++;
            }
            left++;
        }

        return matrix;
    }
}