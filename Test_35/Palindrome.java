public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        boolean pal = true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                pal = false;
                break;
            }
            i++; j--;
        }
        System.out.println("Palindrome? " + pal);
    }
}
