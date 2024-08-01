package com.dsa.algo.problemSolving.dayThree;

import com.dsa.algo.problemSolving.MyStack;

public class NextGreaterElement {
    public static int[] nextGreaterElements(final int[] nums) {
        int n  = nums.length;
        final MyStack<Integer> stack = new MyStack<>();

        for (int i = n - 1; i >= 0; i--) {
            int greater = -1;
            while(!stack.isEmpty() && stack.peek() <= nums[i])
                stack.pop();
            if (!stack.isEmpty())
                greater = stack.peek();
            stack.push(nums[i]);
            nums[i] = greater;
        }
        return nums;
    }
}
