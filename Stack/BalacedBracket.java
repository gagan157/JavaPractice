package Stack;
import java.util.*;
public class BalacedBracket {
    public static boolean checkAlpha(char ch) {
        if(ch == '[' || ch == ']' || ch == '(' || ch == ')' || ch == '{' || ch == '}'){
            return true;
        }
        return false;
    }
    public static boolean balancedBracket(String str) {
        Stack<Character> stack  = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(checkAlpha(ch)){
                if(ch == '(' || ch == '{' || ch == '['){
                    stack.push(ch);
                }
                else{
                    char peekval = stack.peek();
                    if(ch == ')' && peekval == '(' || ch == '}' && peekval == '{' || ch == ']' && peekval == '['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "[(a+b)+{(c+d) * (e/f)}]";
        boolean ans =  balancedBracket(str);
        System.out.print(ans);
    }
}
