package com.dsa.algo.problemSolving.dayTwo;

import com.dsa.algo.problemSolving.DoublyLinkedList;
import com.dsa.algo.problemSolving.DoublyLinkedListNode;

public class IsDoublyLinkedListAPalindrome {
    public static boolean isDoublyLinkedListAPalindrome(final DoublyLinkedList doublyLinkedList) {
        DoublyLinkedListNode head = doublyLinkedList.head;
        DoublyLinkedListNode tail = doublyLinkedList.tail;
        if (head == null && tail == null)
            return false;
        int index = middleIndexOfLinkedList(doublyLinkedList) - 1;
        int count = 0;
        while (head != null && tail != null) {
            if (head.data != tail.data)
                return false;
            if (index == count)
                break;
            head = head.next;
            tail = tail.prev;
            count++;
        }
        return true;
    }

    public static int middleIndexOfLinkedList(final DoublyLinkedList doublyLinkedList) {
        if (doublyLinkedList.head == null)
            return 0;
        if (doublyLinkedList.head.next == null)
            return 1;
        DoublyLinkedListNode fastPointer = doublyLinkedList.head;
        DoublyLinkedListNode slowPointer = doublyLinkedList.head;
        int index = 0;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            index++;
        }
        return index;
    }
}
