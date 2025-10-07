public class Capitalize {
    public static void main(String[] args) {
        String s = "the royal palace";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0)))
              .append(w.substring(1))
              .append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
