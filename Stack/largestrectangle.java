import java.util.Stack;

public class largestrectangle {

    static int largestRectangle(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        // Traverse all bars
        for (int i = 0; i < n; i++) {

            // While current bar is smaller than stack top
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {

                int height = heights[stack.pop()];

                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = right - left - 1;
                int area = height * width;
                System.out.println(area);
                maxArea = Math.max(maxArea, area);
            }

            // Push current index
            stack.push(i);
        }

        // Process remaining bars in stack
        while (!stack.isEmpty()) {

            int height = heights[stack.pop()];

            int right = n;
            int left = stack.isEmpty() ? -1 : stack.peek();

            int width = right - left - 1;
            int area = height * width;
           System.out.println(area+" remaining");
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangle(heights));
    }
}
