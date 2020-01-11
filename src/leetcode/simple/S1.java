package leetcode.simple;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

 有效字符串需满足：

 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。

 */
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
                stack.pop();
            }
        }
        return stack.size() == 0;
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
