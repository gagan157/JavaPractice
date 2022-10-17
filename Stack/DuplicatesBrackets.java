package Stack;
import java.util.*;
public class DuplicatesBrackets {
    public static void duplicateBracket(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')'){
                if(stack.peek() == '('){
                    System.out.print("true");
                    return;
                }
                else{
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        System.out.print("false");
    }
    public static void main(String[] args) {
        String str = "((a+b) * (c+d))";
        duplicateBracket(str);
    }
}
