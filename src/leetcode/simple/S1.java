package leetcode.simple;

import java.util.Stack;

public class S1 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c: chars){
            if(equalLeft(c)){
                stack.push(c);
            }
            if (equalRight(c)){
                if (stack.size() == 0){
                    return false;
                }
                if (!equalChar(stack.peek(), c)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean equalLeft(char a){
        return (a == '(' || a == '{' || a == '[');
    }
    private boolean equalRight(char a){
        return (a == ')' || a == '}' || a == ']');
    }
    private boolean equalChar(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

}
