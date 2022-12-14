class Solution {
    int[][] grid;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        if (grid.length == 0)
            return 0;

        int maxIsland = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxIsland = Math.max(maxIsland, dfs(i, j));
            }
        }
        return maxIsland;
    }

    public int dfs(int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        return 1 + dfs(i + 1, j) + dfs(i - 1, j) + dfs(i, j + 1) + dfs(i, j - 1);
    }
}
