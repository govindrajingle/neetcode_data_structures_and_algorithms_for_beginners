package dp;

public class CountPaths {
    //    Brute force - Time O(2 ^ (n + m))
    public static int bruteForce(int r, int c, int rows, int cols) {
        if (r == rows || c == cols) return 0;
        if (r == rows - 1 && c == cols - 1) return 1;
        return bruteForce(r + 1, c, rows, cols) + bruteForce(r, c + 1, rows, cols);
    }

    //    Memoization - Time O(n * m)
    public static int memoization(int r, int c, int rows, int cols, int[][] cache) {
        if (r == rows || c == cols) return 0;
        if (cache[r][c] > 0) return cache[r][c];
        if (r == rows - 1 && c == cols - 1) return 1;
        cache[r][c] = memoization(r + 1, c, rows, cols, cache) + memoization(r, c + 1, rows, cols, cache);
        return cache[r][c];
    }

    //    Dynamic Programming - Time O(n * m)
    public static int dp(int rows, int cols) {
        int[] prevRow = new int[cols];
        for (int i = rows - 1; i >= 0; i--) {
            int[] currRow = new int[cols];
            currRow[cols - 1] = 1;
            for (int j = cols - 2; j >= 0; j--)
                currRow[j] = currRow[j + 1] + prevRow[j];
            prevRow = currRow;
        }
        return prevRow[0];
    }
}
