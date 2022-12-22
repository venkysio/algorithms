import java.util.*;
public class InFixToPostfix {
    //check precedence of operand
    static int prec(char c){
        switch(c){
            case('+'):
                return 1;
            case('-'):
                return 1;
            case('*'):
                return 2;
            case('/'):
                return 2;
            case('^'):
                return 3;
        }
        // if character or operator is found then return -1
        return -1;
    }
    static String inFixToPostFix(String str){
        String res="";
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            //if character is operator then add to string
            if(Character.isLetterOrDigit(x)){
                res+=x;
            }
            // if character is open brace then push to stack
            else if(x=='('){
                stack.push(x);
            }
            //if character is close brace the pop all operands and add to string
            else if(x==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    res+=stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            //if one more operand is to be pushed into stack then check for precedence
            else{
                while(!stack.isEmpty() && prec(x)<=prec(stack.peek())){
                    res+=stack.peek();
                    stack.pop();
                }
                stack.push(x);
            }
        }
        //add remaining operands to the resultant string
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                return "Invalid Expression :(";
            }
            res+=stack.peek();
            stack.pop();
        }
        return res;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the infix Expression-->");
        String s=input.next();
        input.close();
        String res=inFixToPostFix(s);
        System.out.print("Postfix Expression-->");
        System.out.println(res);
    }
}
