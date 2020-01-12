package leetcode.simple;

import java.util.Stack;

public class S10 {
    private Stack<Integer> data;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public S10() {
        data = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if (!minStack.isEmpty()){
            if (x <= minStack.peek()){
                minStack.push(x);
            }
        }else {
            minStack.push(x);
        }
    }

    public void pop() {
        int pop = data.pop();
        if (pop == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
