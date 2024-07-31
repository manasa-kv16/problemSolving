package com.dsa.algo.problemSolving.dayTwoTests;

import com.dsa.algo.problemSolving.LinkedList;
import com.dsa.algo.problemSolving.LinkedListNode;
import com.dsa.algo.problemSolving.dayTwo.RemoveDuplicatesFromALinkedList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatedFromLinkedListTest {

    	@Test
	public void testIsDuplicatesRemovedFromLinkedList() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		Integer[] arr;

		// Empty list
		RemoveDuplicatesFromALinkedList.removeDuplicatesFromALinkedList(linkedList.head);
		assertEquals(0, linkedList.size());

		// Duplicates added
		arr = new Integer[]{1, 2, 1, 2, 3, 4};
		linkedList.createLinkedList(arr); // create LL
        RemoveDuplicatesFromALinkedList.removeDuplicatesFromALinkedList(linkedList.head); // remove duplicates
		Set<Integer> set = Arrays.stream(arr).collect(Collectors.toSet());
		assertEquals(set.size(), linkedList.size()); // Assert with list size

		// make sure each element is present only once
		LinkedListNode<Integer> current = linkedList.head;
		while (current != null) {
			assertEquals(1, linkedList.getCountOfAnElement(current.data));
			current = current.next;
		}


		// No duplicates
		linkedList = new LinkedList<>();
		arr = new Integer[]{1, 2, 3, 4, 0};
		linkedList.createLinkedList(arr); // create LL
        RemoveDuplicatesFromALinkedList.removeDuplicatesFromALinkedList(linkedList.head); // remove duplicates
		set = Arrays.stream(arr).collect(Collectors.toSet());
		assertEquals(set.size(), linkedList.size()); // Assert with list size

		// make sure each element is present only once
		current = linkedList.head;
		while (current != null) {
			assertEquals(1, linkedList.getCountOfAnElement(current.data));
			current = current.next;
		}
	}
}
