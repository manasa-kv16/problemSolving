package com.dsa.algo.problemSolving.dayTwoTests;

import com.dsa.algo.problemSolving.LinkedList;
import com.dsa.algo.problemSolving.dayTwo.MiddleOfLinkedList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class MiddleOfLinkedListTest {

    @Test
	public void testMiddleOfLinkedList() {
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Empty linked list returns null
        assertNull(MiddleOfLinkedList.middleOfLinkedList(linkedList.head));

		// odd sized linked list returns the second middle
		linkedList = new LinkedList<>();
		linkedList.createLinkedList(new Integer[]{1});
		assertEquals(1, MiddleOfLinkedList.middleOfLinkedList(linkedList.head));

		// Even sized linked list returns the second middle
		linkedList = new LinkedList<>();
		linkedList.createLinkedList(new Integer[]{1, 2});
		assertEquals(2, MiddleOfLinkedList.middleOfLinkedList(linkedList.head));

		// Even sized linked list returns the second middle
		linkedList = new LinkedList<>();
		linkedList.createLinkedList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
		assertEquals(5, MiddleOfLinkedList.middleOfLinkedList(linkedList.head));

		// Odd sized Linked list returns the middle
		linkedList = new LinkedList<>();
		linkedList.createLinkedList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
		assertEquals(5, MiddleOfLinkedList.middleOfLinkedList(linkedList.head));
	}
}
