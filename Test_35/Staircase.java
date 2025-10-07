public class Staircase {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Ways = " + climbWays(n));
    }

    static int climbWays(int n) {
        if (n <= 1) return 1;
        int a = 1, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
