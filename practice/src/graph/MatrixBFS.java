package graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class MatrixBFS {
    int[][] grid = {{0, 0, 0, 1}, {1, 1, 0, 0}, {0, 0, 0, 1}, {0, 1, 0, 0}};

    //    Shortest path from top left to bottom right
    public int bfs(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int[][] visit = new int[4][4];
        Deque<int[]> queue = new ArrayDeque<>();
//        add {0, 0}
        queue.add(new int[2]);
        visit[0][0] = 1;
        int length = 0;
        while (!queue.isEmpty()) {
            int queueLength = queue.size();
            for (int i = 0; i < queueLength; i++) {
                int[] pair = queue.poll();
                int r = pair[0], c = pair[1];
                if (r == ROWS - 1 && c == COLS - 1) {
                    return length;
                }
                int[][] neighbours = {{r, c + 1}, {r, c - 1}, {r + 1, c}, {r - 1, c}};
                for (int j = 0; j < 4; j++) {
                    int newR = neighbours[j][0], newC = neighbours[j][1];
                    if (Math.min(newR, newC) < 0) continue;
                    if (newR == ROWS || newC == COLS) continue;
                    if (visit[newR][newC] == 1 || grid[newR][newC] == 1) continue;
                    queue.add(neighbours[j]);
                    visit[newR][newC] = 1;
                }
            }
            length += 1;
        }
        return length;
    }
}
