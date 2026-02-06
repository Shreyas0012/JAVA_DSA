import java.util.Stack;

public class kpop {

    static void previousGreater(int[] arr) {
     Stack<Integer> stack=new Stack<>();
     for(int i=arr.length-1;i>=0;i--)
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
        int[] arr = {100,20};
        previousGreater(arr);
    }
}
