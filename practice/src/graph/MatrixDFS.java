package graph;

public class MatrixDFS {
    public static int dfs(int[][] grid, int r, int c, int[][] visit) {
        int rows = grid.length, cols = grid[0].length;
        // break conditions of recursion
        if (Math.min(r, c) < 0) return 0;
        if (r == rows || c == cols) return 0;
        if (visit[r][c] == 1) return 0;
        // output condition
        if (r == rows - 1 && c == cols - 1) return 1;
        visit[r][c] = 1;
        int count = 0;
        // recursive condition
        count += dfs(grid, r + 1, c, visit);
        count += dfs(grid, r - 1, c, visit);
        count += dfs(grid, r, c + 1, visit);
        count += dfs(grid, r, c - 1, visit);
        visit[r][c] = 0;
        return count;
    }
}
