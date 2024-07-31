package com.dsa.algo.problemSolving.dayTwoTests;

import com.dsa.algo.problemSolving.DoublyLinkedList;
import com.dsa.algo.problemSolving.dayTwo.IsDoublyLinkedListAPalindrome;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class IsDoublyLinkedListAPalindromeTest {

    @Test
	public void testIsDoublyLinkedListAPalindrome() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		// Empty doubly linked list returns false
		assertFalse(IsDoublyLinkedListAPalindrome.isDoublyLinkedListAPalindrome(doublyLinkedList));

		// non-palindromic doubly linked list returns false
		doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.createLinkedList(new int[]{1, 2, 3});
		assertFalse(IsDoublyLinkedListAPalindrome.isDoublyLinkedListAPalindrome(doublyLinkedList));

		doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.createLinkedList(new int[]{1, 2, 3, 4, -3, 2, 1});
		assertFalse(IsDoublyLinkedListAPalindrome.isDoublyLinkedListAPalindrome(doublyLinkedList));

		doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.createLinkedList(new int[]{0, 1, 0, 1});
		assertFalse(IsDoublyLinkedListAPalindrome.isDoublyLinkedListAPalindrome(doublyLinkedList));


		// If DLL has a single element it should return true
		doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.createLinkedList(new int[]{1});
		assertTrue(IsDoublyLinkedListAPalindrome.isDoublyLinkedListAPalindrome(doublyLinkedList));

		// palindromic doubly linked list returns true
		// odd list size
		doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5, 4, 3 ,2, 1});
		assertTrue(IsDoublyLinkedListAPalindrome.isDoublyLinkedListAPalindrome(doublyLinkedList));

		// even list size
		doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.createLinkedList(new int[]{1, 2, 3, 4, 4, 3 ,2, 1});
		assertTrue(IsDoublyLinkedListAPalindrome.isDoublyLinkedListAPalindrome(doublyLinkedList));
	}
}
