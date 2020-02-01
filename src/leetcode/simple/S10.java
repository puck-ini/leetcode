package leetcode.simple;

import java.util.Stack;

public class S10 {
//    //双栈
//    private Stack<Integer> data;
//    private Stack<Integer> minStack;
//    /** initialize your data structure here. */
//    public S10() {
//        data = new Stack<>();
//        minStack = new Stack<>();
//    }
//
//    public void push(int x) {
//        data.push(x);
//        if (!minStack.isEmpty()){
//            if (x <= minStack.peek()){
//                minStack.push(x);
//            }
//        }else {
//            minStack.push(x);
//        }
//    }
//
//    public void pop() {
//        int pop = data.pop();
//        if (pop == minStack.peek()){
//            minStack.pop();
//        }
//    }
//
//    public int top() {
//        return data.peek();
//    }
//
//    public int getMin() {
//        return minStack.peek();
//    }
    //单栈
    private Stack<Integer> data;
    private int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public S10() {
        data = new Stack<>();
    }

    //push新最小值时，将原来的最小值先入栈再入栈新最小值
    public void push(int x) {
        if (x <= min){
            data.push(min);
            min = x;
        }
        data.push(x);
    }

    public void pop() {
        //当最小值在栈顶时，先pop出栈顶元素，再pop出之前的最小值赋予min
        if (data.pop() == min){
            min = data.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return min;
    }
}
