class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int numIs = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    numIs += 1;
                    dfs(i, j, grid, m, n);
                }
            }
        }
        return numIs;
    }

    public void dfs(int i, int j, char[][] grid, int m, int n) {
        if (i >= m || i < 0 || j >= n || j < 0 || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(i + 1, j, grid, m, n); // Down
        dfs(i - 1, j, grid, m, n); // Up
        dfs(i, j + 1, grid, m, n); // Right
        dfs(i, j - 1, grid, m, n); // Left
    }
}