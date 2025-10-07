public class PowerOf2 {
    public static void main(String[] args) {
        int n = 16;
        boolean result = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println("Power of 2? " + result);
    }
}
