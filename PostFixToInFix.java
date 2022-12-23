import java.util.*;
public class PostFixToInFix {
    //check  whether charcter is operand or not
    static boolean isOperand(char c){
        return (c>='a' && c<='z')||(c>='A' && c<='Z');
    }
    static String postFixToInFix(String exp){
        Stack<String> s=new Stack<String>();
        for(int i=0;i<exp.length();i++){
            char x=exp.charAt(i);
            //if the character is operator then push to stack
            if(isOperand(x)){
                s.push(x+" ");
            }
            //if the operand if found then pop two operators from the stack 
            //perform the operation and push the result into the stack
            else{
                String s1=s.peek();
                s.pop();
                String s2=s.peek();
                s.pop();
                s.push("("+s2+x+" "+s1+")");
            }
        }
        return s.peek();
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the postfix expression-->");
        String s=input.next();
        input.close();
        String s1=postFixToInFix(s);
        System.out.print("Infix Expression-->");
        System.out.println(s1);
    }
}
