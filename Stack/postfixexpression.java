import java.util.Stack;
public class postfixexpression{
    static void postfix(String str){
        Stack<Integer> stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }
            else{
                int b=stack.pop();
                int a=stack.pop();
                if(ch=='+'){
                    stack.push(a+b);
                }if(ch=='-'){
                    stack.push(a-b);
                }if(ch=='*'){
                    stack.push(a*b);
                }if(ch=='/'){
                    stack.push(a/b);
                }
            }
            
        }
        if(!stack.isEmpty()){
                System.out.println(stack.peek());
            }

    }
    public static void main(String[] args) {
        String str="231*+9-";
        postfix(str);
    }
}