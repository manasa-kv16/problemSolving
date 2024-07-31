package com.dsa.algo.problemSolving.dayTwo;

import com.dsa.algo.problemSolving.LinkedListNode;

import java.util.HashSet;

public class RemoveDuplicatesFromALinkedList {
    public static void removeDuplicatesFromALinkedList(final LinkedListNode<Integer> head) {
        if (head == null || head.next == null)
            return;

        LinkedListNode<Integer> previous = head;
        LinkedListNode<Integer> current = head.next;
        HashSet<Integer> set = new HashSet<>();
        set.add(head.data);

        while (current != null) {
            if (set.contains(current.data)) {
                previous.next = current.next;
            }
            else {
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }
}
