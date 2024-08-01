package com.dsa.algo.problemSolving.dayThreeTests;

import com.dsa.algo.problemSolving.dayThree.MinStack;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MinStackTests {

    @Test
    public void testMinStack() {
        MinStack minStack = new MinStack(5);
        minStack.push(2);
        minStack.push(1);
        minStack.push(0);

        // minStack.print();
        assertEquals(minStack.min(), 0);
        minStack.pop();
        assertEquals(minStack.min(), 1);
        minStack.pop();
        minStack.push(10);
        minStack.push(2);
        assertEquals(minStack.min(), 2);
        minStack.pop();
        assertEquals(minStack.min(), 2);
    }
}
