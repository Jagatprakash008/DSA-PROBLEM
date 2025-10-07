public class CountPonds {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        int[][] grid = {
            {1, 0, 1},
            {0, 0, 0},
            {1, 0, 1}
        };
        int count = countPonds(grid);
        System.out.println("Number of ponds: " + count);
    }

    static int countPonds(int[][] g) {
        int n = g.length, m = g[0].length;
        boolean[][] vis = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 1 && !vis[i][j]) {
                    dfs(g, vis, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    static void dfs(int[][] g, boolean[][] vis, int x, int y) {
        vis[x][y] = true;
        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k], ny = y + dy[k];
            if (nx >= 0 && ny >= 0 && nx < g.length && ny < g[0].length && g[nx][ny] == 1 && !vis[nx][ny])
                dfs(g, vis, nx, ny);
        }
    }
}
