import java.util.Stack;

public class remove_adjacent_duplicate {
    static String remove(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuilder res = new StringBuilder();
        for (char c : st) res.append(c);
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(remove("abbaca")); // ca
    }
}
