public class MaxRowSum {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = -1;

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++)
                sum += mat[i][j];
            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }
        System.out.println("Row " + rowIndex + " has max sum " + maxSum);
    }
}
