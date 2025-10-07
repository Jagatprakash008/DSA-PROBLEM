
public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println("Balanced? " + isBalanced(s));
    }

    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if ("({[".indexOf(c) != -1) st.push(c);
            else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{'))
                    return false;
            }
        }
        return st.isEmpty();
    }
}
