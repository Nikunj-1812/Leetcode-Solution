class Solution {

    public boolean helper(int[][] grid, int row, int col, int num) {
        int n = grid.length;

        if (grid[row][col] == n * n - 1) {
            return true;
        }

        int i, j;

        // 1. (-2, +1)
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == num + 1) {
            return helper(grid, i, j, num + 1);
        }

        // 2. (-2, -1)
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) {
            return helper(grid, i, j, num + 1);
        }

        // 3. (+2, +1)
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == num + 1) {
            return helper(grid, i, j, num + 1);
        }

        // 4. (+2, -1)
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == num + 1) {
            return helper(grid, i, j, num + 1);
        }

        // 5. (-1, +2)
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == num + 1) {
            return helper(grid, i, j, num + 1);
        }

        // 6. (-1, -2)
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) {
            return helper(grid, i, j, num + 1);
        }

        // 7. (+1, +2)
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == num + 1) {
            return helper(grid, i, j, num + 1);
        }

        // 8. (+1, -2)
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == num + 1) {
            return helper(grid, i, j, num + 1);
        }

        return false;
    }

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) {
            return false;
        }

        return helper(grid, 0, 0, 0);
    }
}