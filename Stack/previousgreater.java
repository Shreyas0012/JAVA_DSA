import java.util.Stack;

public class previousgreater {

    static void previousGreater(int[] arr) {
     Stack<Integer> stack=new Stack<>();
     for(int i=0;i<arr.length;i++)
{      while(!stack.empty() && stack.peek()>=arr[i]){
        int pop=stack.pop();
        System.out.println(pop+"->"+arr[i]);
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
