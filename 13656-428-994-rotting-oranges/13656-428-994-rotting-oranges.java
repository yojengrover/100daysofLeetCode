class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int num = 0; // Initialize to 0
        Queue<int[]> qu = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    qu.offer(new int[] { i, j });
                }
                if (grid[i][j] == 1) {
                    fresh += 1;
                }
            }
        }
        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        while (!qu.isEmpty() && fresh > 0) {
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                int[] node = qu.poll();
                int ci = node[0];
                int cj = node[1];
                for (int[] dir : directions) {
                    int newRow = ci + dir[0];
                    int newCol = cj + dir[1];
                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        fresh--;
                        qu.add(new int[] { newRow, newCol });
                    }
                }
            }
            num++;
        }
        return fresh == 0 ? num : -1;

    }
}