package com.dsa.algo.problemSolving.dayThreeTests;

import com.dsa.algo.problemSolving.dayThree.NextGreaterElement;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class NextGreaterElementTest {

    @Test
    public void testNextGreaterElement() {
        int[] res = NextGreaterElement.nextGreaterElements(new int[]{100,1,11,1,120,-1});
        assertEquals(res[0], 120);
        assertEquals(res[1], 11);
        assertEquals(res[2], 120);
        assertEquals(res[3], 120);
        assertEquals(res[4], -1);
        assertEquals(res[5], -1);
    }
}
