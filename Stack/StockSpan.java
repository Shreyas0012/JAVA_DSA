import java.util.Stack;
public class StockSpan {
    static int[] stockspan(int[]arr){
        int[]span=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() &&arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-stack.peek();
            }
            stack.push(i);
            }
        
        return span;
    }
public static void main(String[] args) {
    int[] arr={100,80,60,70,60,75,85};
    int[] span=stockspan(arr);
    for(int i=0;i<span.length;i++){
        System.out.print(span[i]+" ");
    }
}
}
