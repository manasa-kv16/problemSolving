package com.dsa.algo.problemSolving.dayThree;

import com.dsa.algo.problemSolving.MyStack;

import java.util.Objects;

public class MinStack {
    MyStack<Integer> primaryStack; // store all elements
    MyStack<Integer> minStack; // to store min elements & return in O(1)
    int maxSize;

    public MinStack(int maxSize) {
        this.maxSize = maxSize;
        this.primaryStack = new MyStack<>();
        this.minStack = new MyStack<>();
    }

    //removes and returns value from stack
    public Integer pop() {
        if (Objects.equals(minStack.peek(), primaryStack.peek()))
            minStack.pop();
        return primaryStack.pop();
    }

    //pushes value into the stack
    public void push(Integer value) {
        if (minStack.isEmpty() || value <= minStack.peek())
            minStack.push(value);
        primaryStack.push(value);
    }

    //returns minimum value in O(1)
    public int min() {
        if (minStack.isEmpty())
            return -1;
        return minStack.peek();
    }
}
