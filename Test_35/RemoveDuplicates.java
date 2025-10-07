public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "banana";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (res.indexOf(String.valueOf(s.charAt(i))) == -1)
                res.append(s.charAt(i));
        }
        System.out.println("Without duplicates: " + res);
    }
}
