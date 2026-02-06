import java.util.Stack;

public class Asteroid {
    static int[] collide(int[] ast) {
        Stack<Integer> st = new Stack<>();

        for (int a : ast) {
            while (!st.isEmpty() && st.peek() > 0 && a < 0 && st.peek() < -a) {
                st.pop();
            }
            if (st.isEmpty() || a > 0 || st.peek() < 0) {
                st.push(a);
            } else if (st.peek() == -a) {
                st.pop();
            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] ast = {5, 10, -5};
        int[] res = collide(ast);
        for (int a : res) {
            System.out.print(a + " ");
        }
    }
}
