public class CountWords {
    public static void main(String[] args) {
        String s = "The king rules wisely";
        String[] words = s.trim().split("\\s+");
        System.out.println("Word count = " + words.length);
    }
}
