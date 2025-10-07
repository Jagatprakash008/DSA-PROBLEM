public class CountSetBits {
    public static void main(String[] args) {
        int n = 13; // binary 1101
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) count++;
            n >>= 1;
        }
        System.out.println("Set bits = " + count);
    }
}
