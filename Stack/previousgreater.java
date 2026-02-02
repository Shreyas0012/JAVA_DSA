import java.util.Stack;

public class previousgreater {

    static void previousGreater(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove all smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Print previous greater
            if (stack.isEmpty()) {
                System.out.println(arr[i] + " -> -1");
            } else {
                System.out.println(arr[i] + " -> " + stack.peek());
            }

            // Push current element
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 20, 40, 12};
        previousGreater(arr);
    }
}
