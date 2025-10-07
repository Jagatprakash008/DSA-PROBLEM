import java.util.*;

public class GridPath {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 1},
            {1, 0, 1},
            {0, 0, 0}
        };
        int n = grid.length, m = grid[0].length;
        boolean result = bfs(grid, n, m);
        System.out.println("Path exists? " + result);
    }

    static boolean bfs(int[][] grid, int n, int m) {
        if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1) return false;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][m];
        q.add(new int[]{0, 0});
        vis[0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.remove();
            if (cur[0] == n - 1 && cur[1] == m - 1)
                return true;

            for (int k = 0; k < 4; k++) {
                int nx = cur[0] + dx[k];
                int ny = cur[1] + dy[k];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !vis[nx][ny] && grid[nx][ny] == 0) {
                    vis[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        return false;
    }
}
