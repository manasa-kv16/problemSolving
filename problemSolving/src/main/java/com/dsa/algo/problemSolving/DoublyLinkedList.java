package com.dsa.algo.problemSolving;

public class DoublyLinkedList {

    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void createLinkedList(int[] lst) {
        for (int i = 0; i < lst.length; i++) {
            DoublyLinkedListNode newNode = new DoublyLinkedListNode(lst[i]);
            insertNodeAtTail(newNode);
        }
    }

    public void insertNodeAtHead(DoublyLinkedListNode node) {
        if (head != null) {
            node.next = head;
            head.prev = node;
        }
        head = node;
    }

    public void insertNodeAtTail(DoublyLinkedListNode node) {
        if (head == null) {
            head = node;
            tail = head;
            return;
        }
        node.prev = tail;
        tail.next = node;
        tail = node;

    }

    public void print() {
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printReverse() {
        DoublyLinkedListNode current = tail;
        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}



