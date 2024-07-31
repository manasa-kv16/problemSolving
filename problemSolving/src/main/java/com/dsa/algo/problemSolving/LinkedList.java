package com.dsa.algo.problemSolving;

public class LinkedList<T> {
    public LinkedListNode<T> head;
    public LinkedList() {
        this.head = null;
    }

    public void insertNodeAtHead(LinkedListNode<T> node) {
        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
    }

    public void createLinkedList(T[] lst) {
        for (int i = lst.length - 1; i >= 0; i--) {
            LinkedListNode<T> newNode = new LinkedListNode<T>(lst[i]);
            insertNodeAtHead(newNode);
        }
    }

    public void print() {
        LinkedListNode current = head;
        System.out.println("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public LinkedListNode addDataAtTail(final T data) {
        if (head == null) {
            return new LinkedListNode(data);
        }
        LinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new LinkedListNode<>(data);
        return head;
    }

    public int size() {
        int size = 0;
        LinkedListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public int getCountOfAnElement(T data) {
        int size = 0;
        LinkedListNode current = head;
        while (current != null) {
            if (current.data == data)
                size++;
            current = current.next;
        }
        return size;
    }
}