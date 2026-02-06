import java.util.Stack;
public class postfixexpression {
    static void postfix(String str){
        Stack<Integer> stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }
            else{
                int a=stack.pop();
                int b=stack.pop();
                if(ch=='-'){
                    stack.push(b-a);
                }
                if(ch=='+'){
                    stack.push(a+b);
                }
                if(ch=='*'){
                    stack.push(a*b);
                }
                if(ch=='/'){
                    stack.push(b/a);
                }
                }
            }
            while(!stack.isEmpty()){
                System.out.print(stack.pop());

            }
        }
        public static void main(String[] args) {
            String str="231*+9-";
            postfix(str);
        }
    }
