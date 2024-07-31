package com.dsa.algo.problemSolving.dayTwo;

import com.dsa.algo.problemSolving.LinkedListNode;

public class MiddleOfLinkedList {
    public static Integer middleOfLinkedList(final LinkedListNode<Integer> head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head.data;

        LinkedListNode<Integer> fastPointer = head;
        LinkedListNode<Integer> slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer.data;
    }



}
