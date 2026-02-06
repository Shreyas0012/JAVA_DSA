import java.util.Stack;

public class nextsmaller {

    static void previousGreater(int[] arr) {
     Stack<Integer> stack=new Stack<>();
     for(int i=0;i<arr.length;i++)
{      while(!stack.empty() && stack.peek()>=arr[i]){
        stack.pop();
         }
         if(stack.isEmpty()){
            System.out.println(arr[i]+"->"+-1);
         }
         else{
            System.out.println(arr[i]+"->"+stack.peek());
         }
         stack.push(arr[i]);
}        }
            public static void main(String[] args) {
        int[] arr = {100,20,80,30,20,80};
        previousGreater(arr);
    }
}
