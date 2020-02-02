package leetcode.simple;

import java.util.Stack;

public class S21 {
    private Stack<Integer> stack;
    private Stack<Integer> stackHelper;
    private Integer front;

    /** Initialize your data structure here. */
    public S21() {
        this.stack = new Stack<>();
        this.stackHelper = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (stack.empty()){
            front = x;
        }
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stackHelper.empty()){
            while (!stack.empty()){
                stackHelper.push(stack.pop());
            }
        }
        return stackHelper.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!stackHelper.empty()){
            return stackHelper.peek();
        }
        return this.front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty() && stackHelper.empty();
    }
}
