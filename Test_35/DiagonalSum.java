public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = mat.length;
        int primary = 0, secondary = 0;

        for (int i = 0; i < n; i++) {
            primary += mat[i][i];
            secondary += mat[i][n - 1 - i];
        }
        System.out.println("Primary: " + primary);
        System.out.println("Secondary: " + secondary);
    }
}
